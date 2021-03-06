package Dao;

import model.Assets;
import model.Electronic;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ElectronicDataAccessService implements ElectronicsDao {

    List<Assets> DB=new ArrayList<>();

    // Insert electronic without UUID
    @Override
    public int insertProduct(UUID id, Electronic electronicDevice) {
        DB.add(new Electronic(electronicDevice.getId(),
                electronicDevice.getSerialNo(),
                electronicDevice.getMake(),
                electronicDevice.getType(),
                electronicDevice.isAvailability(),
                electronicDevice.getStatus()));
        return 1;
    }

    //Insert electronic with UUID
    @Override
    public int insertProduct(Electronic electronicDevice) {
        DB.add(new Electronic(UUID.randomUUID(),
                electronicDevice.getSerialNo(),
                electronicDevice.getMake(),
                electronicDevice.getType(),
                electronicDevice.isAvailability(),
                electronicDevice.getStatus()));
        return 1;
    }
}
