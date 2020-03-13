package com.AssetManagement.datasource.model;

import java.util.UUID;

public abstract class Assets {

    private  UUID id;
    private String manufacturer;
    private boolean assinged;
    private String assingedTo;
    private String category;
    private String model;

    public Assets(){}

    public Assets(UUID id, String manufacturer, boolean assinged, String assingedTo, String category, String model) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.assinged = assinged;
        this.assingedTo = assingedTo;
        this.category = category;
        this.model = model;
    }

    public UUID getId(){return this.id;}
    //getters
    public String getManufacturer() {
        return this.manufacturer;
    }
    public String getCategory() {
        return this.category;
    }
    public String getModel() { return model;}
    public String getAssingedTo() { return assingedTo; }
    public boolean getIsAssinged() { return assinged; }

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
    public void setAssingedTo(String assingedTo) { this.assingedTo = assingedTo;}
    public void setAssinged(boolean assinged) { this.assinged = assinged;}


}
