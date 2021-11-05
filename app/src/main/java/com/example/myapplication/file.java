package com.example.myapplication;

public class file {
    private String tenf;
    private boolean isDoc;

    public file(String tenf, boolean isDoc){
        this.tenf = tenf;
        this.isDoc = isDoc;
    }

    public boolean isDoc() {
        return isDoc;
    }
    public void setDoc(boolean doc) {
        isDoc = doc;
    }

    public file(String tenf){
        this.tenf = tenf;
    }

    public String getTenf() {
        return tenf;
    }

    public void setTenf(String tenf) {
        this.tenf = tenf;
    }
}
