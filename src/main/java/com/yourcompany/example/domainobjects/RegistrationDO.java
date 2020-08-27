package com.yourcompany.example.domainobjects;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.yourcompany.example.pageobjects.AuthenticationPO;
import com.yourcompany.example.pageobjects.CreateAccountPO;
import org.assertj.core.api.Assertions;
import ru.yandex.qatools.allure.annotations.Step;
import ui.auto.core.support.AliasedString;
import ui.auto.core.support.DomainObjectModel;
import ui.auto.core.utils.WebHelper;

@XStreamAlias("registration")
public class RegistrationDO extends DomainObjectModel {
    private AliasedString url;
    private AuthenticationPO authenticationPO;
    private CreateAccountPO createAccountPO;

    public RegistrationDO() {
    }

    @Step("Create New Account")
    public void createNewAccount() {
        getDriver().get(url.getData());
        authenticationPO.initPage(getContext());
        authenticationPO.populateEmail();
        authenticationPO.clickCreateAccount();
        createAccountPO.initPage(getContext());
        createAccountPO.fillForm();
        createAccountPO.clickRegisterButton();
        WebHelper.waitForXHR();
        Assertions.assertThat(getDriver().getCurrentUrl()).contains("controller=my-account");
    }

}
