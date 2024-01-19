package com.example.realestate.Model;

public class ModelBuy {
    private int ivHouse;
    private String stvHouseDetail;
    private String stvHouseDescription;
    private String stvCurrency;
    private String stvPrice;
    private String stvPriceDetail;
    private String stvBedNo;
    private String stvBathNo;
    private String stvMarlaNo;

    public ModelBuy(int ivHouse, String stvHouseDetail, String stvHouseDescription, String stvCurrency, String stvPrice, String stvPriceDetail, String stvBedNo, String stvBathNo, String stvMarlaNo) {
        this.ivHouse = ivHouse;
        this.stvHouseDetail = stvHouseDetail;
        this.stvHouseDescription = stvHouseDescription;
        this.stvCurrency = stvCurrency;
        this.stvPrice = stvPrice;
        this.stvPriceDetail = stvPriceDetail;
        this.stvBedNo = stvBedNo;
        this.stvBathNo = stvBathNo;
        this.stvMarlaNo = stvMarlaNo;
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

    public String getStvHouseDescription() {
        return stvHouseDescription;
    }

    public void setStvHouseDescription(String stvHouseDescription) {
        this.stvHouseDescription = stvHouseDescription;
    }

    public String getStvCurrency() {
        return stvCurrency;
    }

    public void setStvCurrency(String stvCurrency) {
        this.stvCurrency = stvCurrency;
    }

    public String getStvPrice() {
        return stvPrice;
    }

    public void setStvPrice(String stvPrice) {
        this.stvPrice = stvPrice;
    }

    public String getStvPriceDetail() {
        return stvPriceDetail;
    }

    public void setStvPriceDetail(String stvPriceDetail) {
        this.stvPriceDetail = stvPriceDetail;
    }

    public String getStvBedNo() {
        return stvBedNo;
    }

    public void setStvBedNo(String stvBedNo) {
        this.stvBedNo = stvBedNo;
    }

    public String getStvBathNo() {
        return stvBathNo;
    }

    public void setStvBathNo(String stvBathNo) {
        this.stvBathNo = stvBathNo;
    }

    public String getStvMarlaNo() {
        return stvMarlaNo;
    }

    public void setStvMarlaNo(String stvMarlaNo) {
        this.stvMarlaNo = stvMarlaNo;
    }
}

