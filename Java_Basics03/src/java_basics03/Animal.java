
package java_basics03;


public interface Animal {
    public void speak();
}

class Car implements Animal{
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