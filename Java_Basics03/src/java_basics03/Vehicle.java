
package java_basics03;

//An abstract class contain both abstract and non-abstract methods
//The class which extends an abstract class should override all abstract methods

public abstract class Vehicle {
    
    public abstract void move();
    public void getDescription(){
        System.out.println("Vehicle are used for transportation.");
    }
    
}
class Bicycle extends Vehicle{
    
    @override
    public void move(){
        System.out.println("The bicycle pedals forward.");
    }
}
class Plane extends Vehicle{

    @override
    public void move(){
        System.out.println("The fly through the sky.");
    }
}
