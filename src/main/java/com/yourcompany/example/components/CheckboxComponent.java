package com.yourcompany.example.components;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import ui.auto.core.data.DataTypes;
import ui.auto.core.pagecomponent.PageComponent;

public class CheckboxComponent extends PageComponent {
    @Override
    protected void init() {
    }

    public void setValue() {
        if (!getValue().equals(getData())) {
            coreElement.findElement(By.xpath("./..")).click();
        }
    }

    public String getValue() {
        return String.valueOf(coreElement.isSelected());
    }

    public void validateData(DataTypes dataTypes) {
        Assertions.assertThat(getValue()).isEqualTo(getData(dataTypes));
    }
}
