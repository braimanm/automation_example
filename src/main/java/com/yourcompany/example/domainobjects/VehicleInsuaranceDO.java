package com.yourcompany.example.domainobjects;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.yourcompany.example.pageobjects.*;
import ui.auto.core.support.DomainObjectModel;
import ui.auto.core.support.TestContext;

@SuppressWarnings({"NewClassNamingConvention", "unused"})
@XStreamAlias("vehicle-insurance-domain-object")
public class VehicleInsuaranceDO extends DomainObjectModel {
    private HomePO homePO;
    private VehicleDataPO vehicleDataPO;
    private InsurantDataPO insurantDataPO;
    private ProductDataPO productDataPO;
    private SelectPriceOptionPO selectPriceOptionPO;
    private SendQuotePO sendQuotePO;

    private VehicleInsuaranceDO() {}

    public VehicleInsuaranceDO(TestContext context) {
        this.context = context;
    }

    public void createNewInsurancePolicy() {
        homePO.initPage(getContext());
        homePO.launchApp();
        homePO.selectVehicleType();

        vehicleDataPO.initPage(getContext());
        vehicleDataPO.populate();
        vehicleDataPO.next();

        insurantDataPO.initPage(getContext());
        insurantDataPO.populate();
        insurantDataPO.next();

        productDataPO.initPage(getContext());
        productDataPO.populate();
        productDataPO.next();

        selectPriceOptionPO.initPage(getContext());
        selectPriceOptionPO.populate();
        selectPriceOptionPO.next();

        sendQuotePO.initPage(getContext());
        sendQuotePO.populate();
        sendQuotePO.send();
        sendQuotePO.validateSendStatus();

    }
}
