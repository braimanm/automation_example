package com.yourcompany.example.pageobjects;

import com.braimanm.datainstiller.data.Data;
import com.braimanm.ui.auto.components.WebComponent;
import com.braimanm.ui.auto.data.DataTypes;
import com.braimanm.ui.auto.pagecomponent.SkipAutoFill;
import com.braimanm.uitaf.support.PageObjectModel;
import com.yourcompany.example.components.AlertComponent;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

@SuppressWarnings({"NewClassNamingConvention", "unused"})
public class SendQuotePO extends PageObjectModel {
    private WebComponent email;
    private WebComponent phone;
    private WebComponent username;
    private WebComponent password;
    private WebComponent confirmpassword;
    @FindBy(css = "#Comments")
    private WebComponent comments;
    @SkipAutoFill
    @FindBy(css = "#sendquote .counter")
    private WebComponent errorCounter;
    @Data(skip = true)
    @FindBy(css = "#sendemail")
    private WebComponent sendButton;
    @SkipAutoFill
    @FindBy(css = "div.sweet-alert")
    private AlertComponent alert;

    @Step("Populate Send Quote form with provided data")
    public void populate() {
        autoFillPage();
    }

    @Step("Check for errors and click Send button")
    public void send() {
        errorCounter.validateData();
        sendButton.click();
    }

    @Step("Validate Send message")
    public void validateSendStatus() {
        alert.validateData(DataTypes.Data);
        alert.dismiss();
    }

    @Step("Populate field \"{0}\" with value \"{1}\"")
    @Override
    protected void reportForAutoFill(String fieldName, String value) {}

}
