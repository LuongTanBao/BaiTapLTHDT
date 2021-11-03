package com.baolt2008110151.Lab5;
public class TenChuXe {
    String name,address,sex,birth;
    void getAddress(String text){
        address = text;
    }
    TenChuXe(String text){
        name = text;
    }
    void getSex(String text){
        sex = text;
    }
    void getBirth(String text){
        birth = text;
    }
    void showData(){
        System.out.println("Tên: "+name);
        System.out.println("address: "+address);
        System.out.println("sex(male/female): "+sex);
        System.out.println("birth: "+birth);
    }
}
