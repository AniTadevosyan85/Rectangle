package org.example;
import java.util.Scanner;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(){
        this.length= 20;
        this.breadth=80;

    }
    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length =length;

    }
   public double getBreadth(){
        return breadth;
   }
   public void setBreadth(double breadth){
        this.breadth=breadth;
   }
   public double getArea(){
        return length*breadth;
   }
   public double getPerimeter(){
        return 2*(length+breadth);
   }
   public static void main (String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        double length=scanner.nextDouble();

        System.out.println("Enter the breadth of the rectangle:");
        double breadth=scanner.nextDouble();

        Rectangle rectangle=new Rectangle(length,breadth);

        System.out.println("Length:"+rectangle.getLength());
        System.out.println("Breadth:"+rectangle.getBreadth());
        System.out.println("Area:"+rectangle.getArea());
        System.out.println("Perimeter:"+rectangle.getPerimeter());


        scanner.close();
   }

}


