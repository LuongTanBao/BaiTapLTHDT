package com.baolt2008110151.lab2;
import java.util.Scanner;
public class Lab2Bai2 {   

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a, b, c;
            a=NhapSoNguyen("nhap he so a: ");
            b=NhapSoNguyen("nhap he so b: ");
            c=NhapSoNguyen("nhap he so c: ");
            GiaiPTbac2(a,b,c);
        }

        public static void GiaiPTbac2(int a, int b, int c) {
            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phương trình vô nghiệm!");
                } else {
                    System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
                }
                return;
            }
            float delta = b*b - 4*a*c;
            float x1;
            float x2;
            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
                System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        }
        public static int NhapSoNguyen(String str) {
            int x;
            Scanner scanner= new Scanner(System.in);
            System.out.println(str);
            x=scanner.nextInt();
            return 0;
        }
    }
    
