package com.AssetManagement.datasource.api;

import com.AssetManagement.datasource.model.Electronic;
import com.AssetManagement.datasource.service.AssetsServices;


public class AssetsController {

    private final AssetsServices assetsServices;


    public AssetsController(AssetsServices assetsServices) {
        this.assetsServices = assetsServices;
    }
    

    public void addAsset(Electronic electronic){assetsServices.addAsset(electronic);}
}
