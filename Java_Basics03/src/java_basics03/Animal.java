
package java_basics03;

//Interfaces contain only final variables and abstract methods only.
//Interface can exetends another interface.
//A class can extends only one class but can implement several interfaces.

//This is Abstraction..

public interface Animal {
    public void speak();// this is an abstract method but doesn't declare as abstract
}

class Cat implements Animal{
    @Override
    public void speak(){
        System.out.println("Meow meow");
    }
}
class Dog implements Animal{
    @Override
    public void speak(){
            System.out.println("Woof woof");
    }
}