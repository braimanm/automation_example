package com.yourcompany.example.pageobjects;

import com.braimanm.ui.auto.pagecomponent.AliasedData;
import com.braimanm.uitaf.support.PageObjectModel;
import com.yourcompany.example.components.MainMenuBarComponent;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;


@SuppressWarnings({"NewClassNamingConvention", "unused"})
public class HomePO extends PageObjectModel {
    private AliasedData url;
    @FindBy(css = ".bottom-header .container")
    private MainMenuBarComponent vehicleType;

    public void selectVehicleType() {
        selectVehicleType(vehicleType.getData());
    }
    
    //This method is needed for reporting only
    @Step("Select vehicle type as \"{0}\"")
    private void selectVehicleType(String type) {
        setElementValue(vehicleType);
    }

    @Step("Launch Vehicle Insurance Application")
    public void launchApp() {
        getDriver().get(url.getData());
    }


}
