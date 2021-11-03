package com.baolt2008110151.Lab4;
import java.util.Scanner;

public class Employe {
    String name;
    String salary;
    Scanner scanner = new Scanner(System.in);
    void getName() {
        System.out.print("Ho va ten nhan vien : ");
        name = scanner.nextLine();
    }
    void getSalary() {
        salary = scanner.nextLine();
        System.out.print("Luong cua nhan vien : ");
    }
    void showData() {
        System.out.println("Ten nhan vien: "+name);
        System.out.println("Luong cua nhan vien: "+salary);
    }
}
