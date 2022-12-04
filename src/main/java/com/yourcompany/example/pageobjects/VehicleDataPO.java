package com.yourcompany.example.pageobjects;

import com.yourcompany.example.components.RadioGroupComponent;
import datainstiller.data.Data;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ui.auto.core.components.SelectComponent;
import ui.auto.core.components.WebComponent;
import ui.auto.core.pagecomponent.SkipAutoFill;
import ui.auto.core.support.PageObjectModel;

@SuppressWarnings({"NewClassNamingConvention", "unused"})
public class VehicleDataPO extends PageObjectModel {
    @FindBy(css = "select#make")
    private SelectComponent make;
    @FindBy(css = "input#engineperformance")
    private WebComponent enginePerformance;
    @FindBy(css = "input#dateofmanufacture")
    private WebComponent dateOfManufacture;
    @FindBy(css = "select#numberofseats,select#numberofseatsmotorcycle")
    private SelectComponent numberOfSeats;
    @FindBy(css = "select#fuel")
    private SelectComponent fuelType;
    @FindBy(css = "input#listprice")
    private WebComponent listPrice;
    @FindBy(css = "input#licenseplatenumber")
    private WebComponent licensePlateNumber;
    @FindBy(css = "input#annualmileage")
    private WebComponent annualMileage;
    @FindBy(css = "input#payload")
    private WebComponent payload;
    @FindBy(css = "input#totalweight")
    private WebComponent totalWeight;
    @FindBy(css = "select#model")
    private SelectComponent model;
    @FindBy(css = "input#cylindercapacity")
    private WebComponent cylinderCapacity;
    @FindBy(xpath = "//label[.='Right Hand Drive']/../p")
    private RadioGroupComponent isRightHandDrive;
    @SkipAutoFill
    @FindBy(css = "#entervehicledata .counter")
    private WebComponent errorCounter;
    @Data(skip = true)
    @FindBy(css = "button#nextenterinsurantdata")
    private WebComponent nextButton;


    @Step("Populate Vehicle Data form with provided data")
    public void populate() {
        autoFillPage();
    }

    @Step("Check for errors and click Next button")
    public void next() {
        errorCounter.isDisplayed();
        errorCounter.validateData();
        nextButton.click();
    }

    @Step("Populate field \"{0}\" with value \"{1}\"")
    @Override
    protected void reportForAutoFill(String fieldName, String value) {}

}
