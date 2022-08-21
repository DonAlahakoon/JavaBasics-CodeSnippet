
package java_basics03;


public abstract class Vehicle {
    
    public abstract void move();
    public void getDescription(){
        System.out.println("Vehicle are used for transportation.");
    }
    
}
class Bicycle extends Vehicle{
    public void move(){
        System.out.println("The bicycle pedals forward.");
    }
}
class Plane extends Vehicle{
    public void move(){
        System.out.println("The fly through the sky.");
    }
}
