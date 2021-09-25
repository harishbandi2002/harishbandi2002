package com.Kluniversity;
class BOX{
    double height;
    double lenght;
    double width;
    void setHeight(double H){
        height=H;
    }
    void  setLenght(double L){
        lenght=L;
    }
    void  setWidth(double W){
        width=W;
    }
    void getBOXvolume(){
        System.out.println("The box volume is: "+(height*lenght*width));
    }
}
public class BoxDemo {
    public static void main(String[]args){
        BOX box1=new BOX();
        box1.setHeight(5);
        box1.setLenght(7);
        box1.setWidth(2);
        box1.getBOXvolume();

    }
}
