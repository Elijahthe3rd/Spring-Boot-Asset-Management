package com.AssetManagement.dao;

import com.AssetManagement.model.Assets;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository("fakeData1")
public interface AssetsDao {

    int insertAsset(UUID id, Assets asset);

    // insert Asset without ID which is Implicitly generated.
    default int insertAssert(Assets asset){
        UUID id=UUID.randomUUID();
        return insertAsset(id,asset);
    };

}
