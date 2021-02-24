package com.yourcompany.example.tests;

import com.yourcompany.example.domainobjects.RegistrationBDD;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ui.auto.core.testng.TestNGBase;
import static ui.auto.core.utils.GivenWhenThen.*;

public class TestRegistrationBDD extends TestNGBase {

    @Parameters("data-set")
    @Test
    public void testForValidRegistrationBDD (@Optional("data/registration_data_dynamic.xml") String dataSet ) {
        RegistrationBDD user = new RegistrationBDD(getContext()).fromResource(dataSet);

        Given(user::is_on_registration_page);
        When(user::provide_valid_account_information);
        And(user::click_register_button);
        Then(user::successfully_created_new_account);
    }
}
