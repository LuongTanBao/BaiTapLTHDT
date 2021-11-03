package com.baolt2008110151.lab2;
import java.util.Scanner;
public class Lab2Bai1 {
    public static void main(String[] args){
        int a, b;
        a=NhapSoNguyen("nhap he so a: ");
        b=NhapSoNguyen("nhap he sp b: ");
        GiaiPTbac1(a,b);
    }
    public static void GiaiPTbac1(int a, int b) {
        if(a==0){
            if(b==0){
                System.out.println("phuong trinh vo so nghiem");    
            }
            else{
                System.out.println("phuong trinh vo  nghiem");
            }
        }
        else{
            System.out.println("phuong trinh x:");}
        }
        private static int NhapSoNguyen(String string) {
            int x;
        Scanner scanner= new Scanner(System.in);
        System.out.println(string);
         x = scanner.nextInt();
        return 0;
    }
}
