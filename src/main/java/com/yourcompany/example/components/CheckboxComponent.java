package com.yourcompany.example.components;

import com.braimanm.ui.auto.data.DataTypes;
import com.braimanm.ui.auto.pagecomponent.PageComponent;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;

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
