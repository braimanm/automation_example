package com.yourcompany.example.components;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ui.auto.core.data.DataTypes;
import ui.auto.core.pagecomponent.PageComponent;
import ui.auto.core.utils.WebHelper;

import java.util.List;

@SuppressWarnings("unused")
public class MainMenuBarComponent extends PageComponent {
    private WebElement mainNavigation;
    private WebElement mobileNavigation;
    private WebElement toggleMenuButton;
    @Override
    protected void init() {
        mainNavigation = coreElement.findElement(By.cssSelector(".main-navigation"));
        mobileNavigation = coreElement.findElement(By.cssSelector(".mobile-navigation"));
        toggleMenuButton = mainNavigation.findElement(By.cssSelector("button.menu-toggle"));
    }

    @Override
    public void setValue() {
        final WebElement navigation;
        if (toggleMenuButton.isDisplayed()) {
            navigation = mobileNavigation;
            toggleMenuButton.click();
            WebHelper.sleep(500); //Wait for menu opening animation to finish
        } else {
            navigation = mainNavigation;
        }
        List<WebElement> navigationItem = navigation.findElements(By.xpath(".//a[.='" + getData() + "']"));
        if (navigationItem.isEmpty()) {
            throw new RuntimeException("The navigation item '" + getData() + "' was not found");
        }
        navigationItem.get(0).click();
    }

    @Override
    public String getValue() {
        String selectedItem = WebHelper.getWebDriver().findElement(By.cssSelector("span#selectedinsurance")).getText();
        return selectedItem.replace("Insurance","").trim();
    }

    @Override
    public void validateData(DataTypes dataTypes) {
        Assertions.assertThat(getValue()).isEqualTo(getData(dataTypes));
    }
}
