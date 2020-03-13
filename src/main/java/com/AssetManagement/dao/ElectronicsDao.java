package com.AssetManagement.dao;

import com.AssetManagement.model.Electronic;
import org.springframework.stereotype.Repository;

import java.util.UUID;


public interface ElectronicsDao {

    int insertProduct(UUID id, Electronic electronicDevice);

    default int insertProduct(Electronic electronicDevice){
        UUID id=UUID.randomUUID();
        return insertProduct(id,electronicDevice);
    }

}
