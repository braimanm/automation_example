package com.yourcompany.example.pageobjects;

import com.yourcompany.example.components.CheckboxComponent;
import com.yourcompany.example.components.HiddenSelectComponent;
import com.yourcompany.example.components.RadioGroupComponent;
import datainstiller.data.Data;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ui.auto.core.components.WebComponent;
import ui.auto.core.support.PageObjectModel;

public class CreateAccountPO extends PageObjectModel {
    @FindBy(xpath = "//label[.='Title']/..")
    private RadioGroupComponent title;
    private WebComponent customer_firstname;
    private WebComponent customer_lastname;
    private WebComponent email;
    private WebComponent passwd;
    @FindBy(id = "uniform-days")
    private HiddenSelectComponent days;
    @FindBy(id = "uniform-months")
    private HiddenSelectComponent months;
    @FindBy(id = "uniform-years")
    private HiddenSelectComponent years;
    @FindBy(id = "uniform-newsletter")
    private CheckboxComponent newsletter;
    @FindBy(id = "uniform-optin")
    private CheckboxComponent optin;
    private WebComponent firstname;
    private WebComponent lastname;
    private WebComponent company;
    private WebComponent address1;
    private WebComponent city;
    @FindBy(id = "uniform-id_state")
    private HiddenSelectComponent id_state;
    private WebComponent postcode;
    @FindBy(id = "uniform-id_country")
    private HiddenSelectComponent id_country;
    private WebComponent other;
    private WebComponent phone;
    private WebComponent alias;
    @Data(skip = true)
    private WebComponent submitAccount;

    @Step("Populate Registration form with given data.")
    public void fillForm() {
        autoFillPage();
    }

    @Step("Click Register button.")
    public void clickRegisterButton() {
        submitAccount.click();
    }

}
