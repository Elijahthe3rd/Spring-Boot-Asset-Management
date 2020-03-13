package com.AssetManagement.datasource.model;

import java.util.UUID;

public class Electronic extends Assets {

    private  String serialNo;
    private final String make;
    private final String type;
    private final boolean availability;
    private final String status;
    private final String model;

//constructor
    public Electronic(UUID id, String serialNo, String make, String type, boolean availability, String status, String model){
        //construction & initialization of local attributes
        this.make = make;
        this.model = model;
        this.type = type;
        this.serialNo = serialNo;
        this.availability = availability;
        this.status = status;

        //construction & initialization of the extended/super abstract class(Assets) attributes aka referral variables
        super.setId(id);
        super.setCategory(this.type);
        super.setModel(this.model);
        super.setAssinged(this.availability);
        super.setManufacturer(this.make);
    }

    public String getSerialNo() { return serialNo; }
    public String getMake() { return super.getManufacturer(); }
    public String getType() { return super.getCategory(); }
    public boolean isAvailability() { return super.getIsAssinged(); }
    public String getStatus() { return status; }
    public String getModel() { return super.getModel(); }
}
