package com.yourcompany.example.pageobjects;

import com.braimanm.datainstiller.data.Data;
import com.braimanm.ui.auto.components.WebComponent;
import com.braimanm.ui.auto.pagecomponent.SkipAutoFill;
import com.braimanm.uitaf.support.PageObjectModel;
import com.yourcompany.example.components.RadioGroupComponent;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

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
