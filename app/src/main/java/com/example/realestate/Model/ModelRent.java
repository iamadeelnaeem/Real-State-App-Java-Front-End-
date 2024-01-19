package com.example.realestate.Model;

public class ModelRent {
    private int ivHouse;
    private String stvHouseDetail;
    private String stvHouseAddress;
    private String stvPrice;
    private String stvBedNo;
    private String stvKitchen;

    public ModelRent(int ivHouse, String stvHouseDetail, String stvHouseAddress, String stvPrice, String stvBedNo, String stvKitchen) {
        this.ivHouse = ivHouse;
        this.stvHouseDetail = stvHouseDetail;
        this.stvHouseAddress = stvHouseAddress;
        this.stvPrice = stvPrice;
        this.stvBedNo = stvBedNo;
        this.stvKitchen = stvKitchen;
    }

    public int getIvHouse() {
        return ivHouse;
    }

    public void setIvHouse(int ivHouse) {
        this.ivHouse = ivHouse;
    }

    public String getStvHouseDetail() {
        return stvHouseDetail;
    }

    public void setStvHouseDetail(String stvHouseDetail) {
        this.stvHouseDetail = stvHouseDetail;
    }

    public String getStvHouseAddress() {
        return stvHouseAddress;
    }

    public void setStvHouseAddress(String stvHouseAddress) {
        this.stvHouseAddress = stvHouseAddress;
    }

    public String getStvPrice() {
        return stvPrice;
    }

    public void setStvPrice(String stvPrice) {
        this.stvPrice = stvPrice;
    }

    public String getStvBedNo() {
        return stvBedNo;
    }

    public void setStvBedNo(String stvBedNo) {
        this.stvBedNo = stvBedNo;
    }

    public String getStvKitchen() {
        return stvKitchen;
    }

    public void setStvKitchen(String stvKitchen) {
        this.stvKitchen = stvKitchen;
    }
}

