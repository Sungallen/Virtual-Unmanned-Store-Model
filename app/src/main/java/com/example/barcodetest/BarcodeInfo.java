package com.example.barcodetest;

import com.vishnusivadas.advanced_httpurlconnection.PutData;

public class BarcodeInfo {
    String barcode_text;
    boolean havedata;
    void BarcodeInfo(){
        barcode_text="";
        havedata=false;
    }
    void setBarcode_text(String code){
        barcode_text=code;
        havedata=true;
    }
    String getBarcode_text(){
        havedata=false;
        return barcode_text;
    }
    void setHavedata(boolean status){
        havedata=status;
    }

}