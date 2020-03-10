package model;

import java.util.UUID;

public class Electronic extends Assets {

    private final String serialNo;
    private final String make;
    private final String type;
    private final boolean availability;
    private final String status;

    public Electronic(UUID id, String serialNo, String make, String type, boolean availability, String status){
        this.make = make;
        super.setManufacturer(this.make);
        super.setId(id);
        this.type = type;
        super.setCategory(this.type);

        this.serialNo = serialNo;
        this.availability = availability;
        this.status = status;
    }

    public String getSerialNo() { return serialNo; }

    public String getMake() { return make; }

    public String getType() { return type; }

    public boolean isAvailability() { return availability; }

    public String getStatus() { return status; }

}
