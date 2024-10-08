package com.yourcompany.example.components;

import com.braimanm.ui.auto.data.DataTypes;
import com.braimanm.ui.auto.pagecomponent.PageComponent;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;

public class RadioGroupComponent extends PageComponent {

    @Override
    protected void init() {
    }

    @Override
    public void setValue() {
        coreElement.findElement(By.xpath(".//input[@value='" + getData() + "']/../span")).click();
    }

    @Override
    public String getValue() {
        return coreElement.findElement(By.cssSelector("input:checked")).getAttribute("value");
    }

    @Override
    public void validateData(DataTypes dataTypes) {
        Assertions.assertThat(getValue()).isEqualTo(getData(dataTypes));
    }
}
