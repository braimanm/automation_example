package com.yourcompany.example.pageobjects;

import com.yourcompany.example.components.RadioGroupComponent;
import datainstiller.data.Data;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ui.auto.core.components.WebComponent;
import ui.auto.core.pagecomponent.SkipAutoFill;
import ui.auto.core.support.PageObjectModel;

@SuppressWarnings({"NewClassNamingConvention", "unused"})
public class SelectPriceOptionPO extends PageObjectModel {
    @FindBy(xpath = "//th[.='Select Option']/..//th[@class='group']")
    private RadioGroupComponent selectOption;
    @SkipAutoFill
    @FindBy(css = "#selectpriceoption .counter")
    private WebComponent errorCounter;
    @Data(skip = true)
    @FindBy(css = "#nextsendquote")
    private WebComponent nextButton;

    @Step("Select Package Option")
    public void populate() {
        setElementValue(selectOption);
    }

    @Step("Check for errors and click Next button")
    public void next() {
        errorCounter.validateData();
        nextButton.click();
    }
}
