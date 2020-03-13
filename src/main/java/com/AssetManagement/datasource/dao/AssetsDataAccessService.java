package com.AssetManagement.datasource.dao;

import com.AssetManagement.datasource.model.Assets;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class AssetsDataAccessService implements AssetsDao{

    List<Assets> assetsDB=new ArrayList<>();
    //(self note): change the database use postgres images.

    @Override
    public int insertAsset(UUID id, Assets asset) {
        assetsDB.add(1,asset);
        return 1;
    }
    @Override
    public int insertAssert(Assets asset) {
        assetsDB.add(asset);
        return 1;
    }
}
