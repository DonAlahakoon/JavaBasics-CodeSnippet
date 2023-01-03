
package java_basics03;


public class Java_Basics03 {

    
    public static void main(String[] args) {
        
        //Exception handling =>   See and  run the Exception1
        
//Basic OOP concepts
        // refer Book.java file
        
        Book book1 = new Book("Lord of the rings","JRR Tolkein");//creating an object
        System.out.println(book1.title);
        book1.readBook();
        
        //using getter and setter to set and get title
        book1.setTitle("Harry Potter");
        System.out.println(book1.getTitle()+"\n\n");
        
        
//Inheritance
        //related to Chef.java
        Chef myChef = new Chef("Gordan Ramsay",54);
        myChef.makeChicken();
        myChef.makeSpecialDish();
        
        ItalianChef iChef = new ItalianChef("Massimo Botura",67,"Italy");
        iChef.makePasta();
        iChef.makeChicken();//Calling method of Chef class
        iChef.makeSpecialDish();//calling overriden method
        System.out.println("\n\n");
        
        
//Abstraction
        //related to Vehicle.java

        Bicycle b=new Bicycle();
        b.move();//calling abstract method(which is overriden in bicycle class)
        b.getDescription();//calling method in abstract class
        
        Plane p=new Plane();
        p.move();
        p.getDescription();
        System.out.println("\n\n");
        
        
//Interface inheritance
        Animal[] animal={
            new Dog(),
            new Car()
        };
        
        animal[0].speak();
        animal[1].speak();
        // or a extended for loop can be use
        for(Animal a:animal){
            a.speak();
        }
    }
    
}
