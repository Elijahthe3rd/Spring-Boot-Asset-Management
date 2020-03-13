package com.AssetManagement.datasource.service;

import com.AssetManagement.datasource.dao.ElectronicsDao;
import com.AssetManagement.datasource.model.Electronic;

public class ElectronicServices {
    private ElectronicsDao electronicsdao;
    public ElectronicServices(ElectronicsDao electronicsDao ){
        this.electronicsdao=electronicsDao;
    }

    public int addElectronic(Electronic electronic){
        return electronicsdao.insertProduct(electronic);
    }

}
