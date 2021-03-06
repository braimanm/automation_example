package com.yourcompany.example.tests;

import com.yourcompany.example.domainobjects.RegistrationDO;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ui.auto.core.testng.TestNGBase;

public class TestRegistration extends TestNGBase {

    @Parameters("data-set")
    @Test
    public void testForValidRegistration(@Optional("data/registration_data_dynamic.xml") String dataSet ) {
        RegistrationDO registrationDO = new RegistrationDO(getContext()).fromResource(dataSet);
        registrationDO.createNewAccount();
    }

}
