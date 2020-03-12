package com.AssetManagement.dao;

import com.AssetManagement.model.Assets;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeData1")
public class AssetsDataAccessService implements AssetsDao{
// N.B)  using fakeData

    List<Assets> assetsDB=new ArrayList<>();

    @Override
    public int insertAsset(UUID id, Assets asset) {
        assetsDB.add(asset);
        return 0;
    }

    @Override
    public int insertAssert(Assets asset) {
        assetsDB.add(asset);
        return 1;
    }
}
