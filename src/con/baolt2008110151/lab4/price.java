/*
* created date:13 Oct 2021
* author: cgm
*/
package com.baolt2008110151.Lab5;

public class price {
        private int maXe,dungTich;
        private double triGia;
        private String chuXe,moTa;
     
        public void bike(int maXe, int dungTich, double triGia) {
            this.maXe = maXe;
            this.dungTich = dungTich;
            this.triGia = triGia;

        }
        public void bike(){
     
        }
        public int getMaXe() {
            return maXe;
        }
     
        public void setMaXe(int maXe) {
            this.maXe = maXe;
        }
     
        public int getDungTich() {
            return dungTich;
        }
     
        public void setDungTich(int dungTich) {
            this.dungTich = dungTich;
        }
     
        public double getTriGia() {
            return triGia;
        }
     
        public void setTriGia(double triGia) {
            this.triGia = triGia;
        }
     
        public String getChuXe() {
            return chuXe;
        }
        public double tinhThue(){
            double thue;
            if(dungTich<100) thue=triGia*0.01;
            else if (dungTich >= 100 && dungTich<=200) thue = triGia * 0.03;
            else thue = triGia * 0.05;
            return thue;
        }
     
        @Override
        public String toString() {
            return maXe + "-"+chuXe + "-"+dungTich + "-"+triGia;
    } 
        void inThue(){
            System.out.printf("%5d %-20s %5d %10.2f %10s %8.5f \n ",maXe,chuXe,dungTich,triGia,moTa,tinhThue());
        }
    
}

  
