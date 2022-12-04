package com.yourcompany.example.pageobjects;

import com.yourcompany.example.components.MainMenuBarComponent;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ui.auto.core.support.AliasedString;
import ui.auto.core.support.PageObjectModel;

@SuppressWarnings({"NewClassNamingConvention", "unused"})
public class HomePO extends PageObjectModel {
    private AliasedString url;
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
