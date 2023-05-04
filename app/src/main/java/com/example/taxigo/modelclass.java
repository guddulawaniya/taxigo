package com.example.taxigo;

public class modelclass {

    String addressTitle,subTitle;


    public modelclass(String addressTitle, String subTitle) {
        this.addressTitle = addressTitle;
        this.subTitle = subTitle;
    }

    public String getAddressTitle() {
        return addressTitle;
    }

    public void setAddressTitle(String addressTitle) {
        this.addressTitle = addressTitle;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
}
