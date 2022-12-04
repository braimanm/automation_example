package com.yourcompany.example.pageobjects;

import com.yourcompany.example.components.CheckboxComponent;
import com.yourcompany.example.components.RadioGroupComponent;
import com.yourcompany.example.components.FileUploadComponent;
import datainstiller.data.Data;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ui.auto.core.components.SelectComponent;
import ui.auto.core.components.WebComponent;
import ui.auto.core.pagecomponent.SkipAutoFill;
import ui.auto.core.support.PageObjectModel;

@SuppressWarnings({"NewClassNamingConvention", "unused"})
public class InsurantDataPO extends PageObjectModel {
    private WebComponent firstname;
    private WebComponent lastname;
    private WebComponent birthdate;
    @FindBy(xpath = "//label[.='Gender']/../p")
    private RadioGroupComponent gender;
    private WebComponent streetaddress;
    private SelectComponent country;
    private WebComponent zipcode;
    private WebComponent city;
    private SelectComponent occupation;
    private CheckboxComponent speeding;
    private CheckboxComponent bungeejumping;
    private CheckboxComponent cliffdiving;
    private CheckboxComponent skydiving;
    private CheckboxComponent other;
    private WebComponent website;
    private FileUploadComponent picture;
    @SkipAutoFill
    @FindBy(css = "#enterinsurantdata .counter")
    private WebComponent errorCounter;
    @Data(skip = true)
    @FindBy(css = "#nextenterproductdata")
    private WebComponent nextButton;


    @Step("Populate Insurant Data form with provided data")
    public void populate() {
        autoFillPage();
    }

    @Step("Check for errors and click Next button")
    public void next() {
        errorCounter.validateData();
        nextButton.click();
    }

    @Step("Populate field \"{0}\" with value \"{1}\"")
    @Override
    protected void reportForAutoFill(String fieldName, String value) {}
}
