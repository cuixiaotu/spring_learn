package com.xiaotu.spring5;

public class Orders {
    private String oname;
    private String address;

    public Orders(String oname,String adderss){
        this.oname = oname;
        this.address = adderss;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oname='" + oname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
