package com.yourcompany.example.pageobjects;

import com.braimanm.datainstiller.data.Data;
import com.braimanm.ui.auto.components.SelectComponent;
import com.braimanm.ui.auto.components.WebComponent;
import com.braimanm.ui.auto.pagecomponent.SkipAutoFill;
import com.braimanm.uitaf.support.PageObjectModel;
import com.yourcompany.example.components.CheckboxComponent;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

@SuppressWarnings({"NewClassNamingConvention", "unused"})
public class ProductDataPO extends PageObjectModel {
    private WebComponent startdate;
    private SelectComponent insurancesum;
    private SelectComponent meritrating;
    private SelectComponent damageinsurance;
    @FindBy(css = "#EuroProtection")
    private CheckboxComponent euroProtection;
    @FindBy(css = "#LegalDefenseInsurance")
    private CheckboxComponent legalDefenseInsurance;
    private SelectComponent courtesycar;
    @SkipAutoFill
    @FindBy(css = "#enterproductdata .counter")
    private WebComponent errorCounter;
    @Data(skip = true)
    @FindBy(css = "#nextselectpriceoption")
    private WebComponent nextButton;

    @Step("Populate Product Data form with provided data")
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
