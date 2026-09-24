/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_basics03;

// This is an example for Polymorphism but abstraction also there.
// Abstraction in the sense using an abstract class to hide unnecessary implementation details;
// Polymorphism in the sense overriding methods by the child class, overloading methods (constructor overloading in the class Quadrilaterals)

public abstract class Shape {
    
    protected double radius;
    protected double length,breadth;
    
   public abstract double area();
   
   public void description(){ //non-abstract method
       System.out.println("This is also a shape");
   }
    
}

class Circle extends Shape {
     
     protected static final double pi = 3.1415926;
     
     public Circle (double radius){
         this.radius = radius;
     }
     
     @Override
     public double area(){
         return pi*radius*radius;
     }
}

// This is an example of multi-level inheritance
// where the class Quadrilaterals is a child class of Shape and the classes Square and Rectangle are child classes of Quadrilaterals
abstract class Quadrilaterals extends Shape {

    public abstract String quadrilateralType();
}

class Square extends Quadrilaterals{

    public Square(double l){
        super.length = l;
    }

    @Override
    public double area(){
        return this.length*this.length;
    }

    @Override
    public String quadrilateralType(){
        return "Square";
    }
}

class Rectangle extends Quadrilaterals{

    public Rectangle(double l,double b){
        super.length = l;
        super.breadth = b;
    }

    @Override
    public double area(){
        return this.length*this.breadth;
    }

    @Override
    public String quadrilateralType() {
        return "Rectangle";
    }
}