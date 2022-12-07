package com.yourcompany.example.components;

import org.apache.commons.io.FileUtils;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ui.auto.core.data.DataTypes;
import ui.auto.core.pagecomponent.PageComponent;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileUploadComponent extends PageComponent {
    private WebElement fileInput;
    private Path filePath;

    @Override
    protected void init() {
        fileInput = coreElement.findElement(By.xpath("./../../input[@type='file']"));
        filePath = FileSystems.getDefault().getPath(getData());
    }

    @Override
    public void setValue() {
        InputStream is  = this.getClass().getClassLoader().getResourceAsStream(getData());
        if (is == null) throw new RuntimeException("Resource file '" + getData() + "' was not found");
        File f = filePath.getFileName().toFile();
        try {
            FileUtils.copyInputStreamToFile(is, f);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        fileInput.sendKeys(f.getAbsolutePath());
    }

    @Override
    public String getValue() {
        return filePath.getParent() + "/" + coreElement.getAttribute("value");
    }

    @Override
    public void validateData(DataTypes dataTypes) {
        Assertions.assertThat(getValue()).isEqualTo(getData(dataTypes));
    }
}
