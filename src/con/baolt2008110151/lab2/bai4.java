package com.namnd2008110152.lab2;
import java.util.Scanner;
public class Lab2Bai4 {
    private static int sodien;
    public static int main(String[] args) {
                 int a, b, c;
                int choiceNumber;
                Scanner scanner = new Scanner(System.in);
                for (;;) {
                    System.out.println("Select function : [1- 4]");
                    System.out.println("Giải phương trình bậc nhất (1)");
                    System.out.println("Giải phương trình bậc 2 (2)");
                    System.out.println("Tính tiền điện (3)");
                    System.out.println("goodbye (4)");
                     
                    do {
                        System.out.println("Bấm số để chọn (1/2/3/4): ");
                        choiceNumber = scanner.nextInt();
                    } while ((choiceNumber < 1) || (choiceNumber > 4));
                     
                    double sodien;
                    switch (choiceNumber) {
                        case 1:
                            System.out.println("Bạn chọn chức năng giải phương trình bậc nhất!");
                            a=Nhapsonguyen("nhap he so a: ");
                            b=Nhapsonguyen("nhap he sp b: ");
                            GiaiPTbac1(a,b);
                            break;
                        case 2:
                            System.out.println("Bạn chọn chức năng Giải phương trình bậc 2");
                            a=Nhapsonguyen("nhap he so a: ");
                            b=Nhapsonguyen("nhap he so b: ");
                            c=Nhapsonguyen("nhap he so c: ");
                            GiaiPTbac2(a,b,c);
                            break;
                        case 3:
                            System.out.println("Bạn chọn chức năng Tính tiền điện");
                            a=Nhapsodien("nhap so dien: ");
                            break;
                        case 4:
                            System.out.println("Bạn chọn chức năng thoát! Tạm biệt!");
                            System.exit(0); // thoát chương trình
                            break;
                    }
                }
            }
    
    private static void GiaiPTbac1(int a, int b) {
        if(a==0){
            if(b==0){
                System.out.println("phuong trinh vo so nghiem");    
            }
            else{
                System.out.println("phuong trinh vo  nghiem");
            }
        }
        else{
            System.out.println("phuong trinh co so nghiem x= : "+(b/a));
        }
    }

    public static int Nhapsonguyen(String string) {
        int i;
        Scanner scanner= new Scanner(System.in);
        System.out.println(string);
        i=scanner.nextInt();
        return 0;
    }
    private static void GiaiPTbac2(int a, int b, int c) {
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
    private static int Nhapsodien(String string) {

        if(Nhapsodien(null)>=50){
            System.out.println("so tien " + (sodien*1000));
        }else{

            System.out.println("so tien" + ((50*1000+(sodien-50)*1200)));
        }
    
        return 0;
    }
    



}
