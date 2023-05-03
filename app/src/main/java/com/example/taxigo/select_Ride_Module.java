package com.example.taxigo;

import android.widget.TextView;

public class select_Ride_Module {

    String startaddress,endaddress,money,mode,status,date;

    public select_Ride_Module(String startaddress, String endaddress, String money, String mode, String status, String date) {
        this.startaddress = startaddress;
        this.endaddress = endaddress;
        this.money = money;
        this.mode = mode;
        this.status = status;
        this.date = date;
    }

    public String getStartaddress() {
        return startaddress;
    }

    public void setStartaddress(String startaddress) {
        this.startaddress = startaddress;
    }

    public String getEndaddress() {
        return endaddress;
    }

    public void setEndaddress(String endaddress) {
        this.endaddress = endaddress;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
