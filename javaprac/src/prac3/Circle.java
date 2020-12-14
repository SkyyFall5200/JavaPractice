package prac3;

import java.util.Scanner;

class Circle1{
    double s,d,R,c;
    void setR(double r){
        this.R=r;
        d=2*R;
        c=2*Math.PI*R;
        s=Math.PI*R*R;
    }

    public double getC(){
        return c;
    }
    public double getS(){
        return s;
    }
    public double getR(){
        return R;
    }
    public double getD(){
        return d;
    }

}

public class Circle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Circle1 circle=new Circle1();
        circle.setR(in.nextDouble());
        System.out.println("Радиус окружности: "+circle.getR());
        System.out.println("Диаметр окружности: "+circle.getD());
        System.out.println("Длина окружности: "+circle.getC());
        System.out.println("Площадь окружности: "+circle.getS());
    }
}
