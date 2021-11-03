package com.baolt2008110152.tuan4;
import java.util.Scanner;

public class Customer {
    String name;
    String address;
    Scanner scanner = new Scanner(System.in);
    void getName() {
        System.out.print("Ho va ten khach hang : ");
        name = scanner.nextLine();
    }
    void getAdress() {
        address = scanner.nextLine();
        System.out.print("Dia chi cua khach hang : ");
    }
    void showData() {
        System.out.println("Ten khach hang: "+name);
        System.out.println("Dia chi khach hang:"+address);
    }
}
