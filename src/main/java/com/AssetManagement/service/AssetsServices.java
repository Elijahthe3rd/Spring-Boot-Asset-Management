package com.AssetManagement.service;

import com.AssetManagement.dao.AssetsDao;
import com.AssetManagement.model.Electronic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AssetsServices {

    @Autowired
    private AssetsDao assetsDao;

    public AssetsServices(@Qualifier("fakeData") AssetsDao assetsDao) {
        this.assetsDao = assetsDao;
    }

    public int addAsset(Electronic electronic){
        return assetsDao.insertAssert(electronic);
    }
}