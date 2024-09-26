package com.yourcompany.example.pageobjects;

import com.braimanm.datainstiller.data.Data;
import com.braimanm.ui.auto.components.SelectComponent;
import com.braimanm.ui.auto.components.WebComponent;
import com.braimanm.ui.auto.pagecomponent.SkipAutoFill;
import com.braimanm.uitaf.support.PageObjectModel;
import com.yourcompany.example.components.CheckboxComponent;
import com.yourcompany.example.components.RadioGroupComponent;
import com.yourcompany.example.components.FileUploadComponent;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

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
