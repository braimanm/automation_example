package com.yourcompany.example.pageobjects;

import datainstiller.data.Data;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ui.auto.core.components.WebComponent;
import ui.auto.core.support.PageObjectModel;
import ui.auto.core.utils.WebHelper;

public class AuthenticationPO extends PageObjectModel {
    private WebComponent email_create;
    @Data(skip = true)
    @FindBy(id = "SubmitCreate")
    private WebComponent submit;

    @Step("Populate email field.")
    public void populateEmail() {
        setElementValue(email_create);
    }

    @Step("Click 'Create an account' button")
    public void clickCreateAccount(){
        submit.click();
        WebHelper.waitForXHR();
        waitForUrl("back=my-account#account-creation");
    }

}
