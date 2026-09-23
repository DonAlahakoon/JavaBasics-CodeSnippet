
package java_basics03;

// An abstract class cannot be instantiated(can't use to create objects) in any case.
// An abstract class contain both abstract and non-abstract methods
// The class which extends an abstract class should override all abstract methods
// Any class with one or more abstract methods need declare itself as abstract

public abstract class Vehicle {
    
    public abstract void move();
    public void getDescription(){
        System.out.println("Vehicles are used for transportation.");
    }
    
}
class Bicycle extends Vehicle{
    
    @Override
    public void move(){
        System.out.println("The bicycle pedals forward.");
    }
}
class Plane extends Vehicle{

    @Override
    public void move(){
        System.out.println("The plane fly through the sky.");
    }
}
