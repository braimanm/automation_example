package com.yourcompany.example.tests;

import com.yourcompany.example.domainobjects.VehicleInsuaranceDO;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ui.auto.core.testng.TestNGBase;

public class TestInsurancePolicy extends TestNGBase {

    @Features("Insurance Policy")
    @Stories("User creates new insurance policy quote")
    @Parameters("data-set")
    @Test
    public void testCreatePolicy(@Optional("data/dynamic-data.xml") String dataSet){
        VehicleInsuaranceDO vehicleInsuaranceDO = new VehicleInsuaranceDO(getContext()).fromResource(dataSet);
        vehicleInsuaranceDO.createNewInsurancePolicy();
    }
}
