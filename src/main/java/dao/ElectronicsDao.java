package dao;

import model.Electronic;

import java.util.UUID;


public interface ElectronicsDao {

    int insertProduct(UUID id, Electronic electronicDevice);

    default int insertProduct(Electronic electronicDevice){
        UUID id=UUID.randomUUID();
        return insertProduct(id,electronicDevice);
    }

}
