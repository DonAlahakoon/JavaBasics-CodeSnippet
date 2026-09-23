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
   
   public void description(){ //non abstract method
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
         double area = 2*pi*radius;
         return area;
     }
}

class Quadrilaterals extends Shape {
    
    // Constructor overloading
    public Quadrilaterals (double l){
        this.length = l;
    }

    public Quadrilaterals (double l,double b){
        this.length = l;
        this.breadth = b;
    }
    @Override
    public double area() {
        return this.length*this.breadth;
    }
    
    public double areaSquare(){
        return this.length*this.length;
    }
    
    
}