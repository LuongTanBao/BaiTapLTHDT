package com.baolt2008110151.tuan6;

public class Amoeba extends Shape {
    protected int x;
    protected int y;
    private Object sound;
    private int s;

    protected Amoeba(int xx, int yy, String a){
        x = xx;
        y = yy;
        sound = s;
    }
    protected void Rotate(){
        System.out.println("\nDa xoay 360 độ với x="+ x +"và y="+ y);
    }
    protected void pláyound(){
        System.out.println("them am thanh.HIF: "+sound);
    }
}
