package model;

import java.util.UUID;

public abstract class Assets {

    private UUID id;
    private String manufacturer;
    private String category;
    private String model;

    public Assets(){}

    public Assets(UUID id,String manufacturer,String category,String model) {
        this.category = category;
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public UUID getId() { return this.id;
    }

    //getters
    public String getManufacturer() {
        return this.manufacturer;
    }
    public String getCategory() {
        return this.category;
    }
    public String getModel() {
        return model;
    }

    //setters
    public void setId(UUID id) {
        this.id = id;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setModel(String model) {
        this.model = model;
    }


}
