package com.yourcompany.example.components;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ui.auto.core.data.DataTypes;
import ui.auto.core.pagecomponent.PageComponentNoDefaultAction;

public class AlertComponent extends PageComponentNoDefaultAction {

    @Override
    protected void init() {
    }

    public void dismiss() {
        coreElement.findElement(By.cssSelector("div.sweet-alert button.confirm")).click();
    }

    @Override
    public void validateData(DataTypes dataTypes) {
        WebElement message = coreElement.findElement(By.cssSelector("h2"));
        Assertions.assertThat(message.getText()).isEqualTo(getData(dataTypes));
    }
}
