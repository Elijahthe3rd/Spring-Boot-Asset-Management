package com.AssetManagement.datasource.api;

import com.AssetManagement.datasource.model.Electronic;
import com.AssetManagement.datasource.service.ElectronicServices;

public class ElectronicController {
    private ElectronicServices electronicServices;

    public ElectronicController(ElectronicServices electronicServices) {
        this.electronicServices = electronicServices;
    }

    public void addAsset(Electronic electronic){electronicServices.addElectronic(electronic);}
}
