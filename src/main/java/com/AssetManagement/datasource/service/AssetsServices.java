package com.AssetManagement.datasource.service;

import com.AssetManagement.datasource.dao.AssetsDao;
import com.AssetManagement.datasource.model.Electronic;


public class AssetsServices {

    private AssetsDao assetsDao;

    public AssetsServices(AssetsDao assetsDao) {
        this.assetsDao = assetsDao;
    }

    public int addAsset(Electronic electronic){
        return assetsDao.insertAssert(electronic);
    }
}
