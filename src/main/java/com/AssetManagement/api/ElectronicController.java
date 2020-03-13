package com.AssetManagement.api;

import com.AssetManagement.model.Electronic;
import com.AssetManagement.service.ElectronicServices;

public class ElectronicController {
    private ElectronicServices electronicServices;

    public ElectronicController(ElectronicServices electronicServices) {
        this.electronicServices = electronicServices;
    }

    public void addAsset(Electronic electronic){electronicServices.addElectronic(electronic);}
}
