
package java_basics03;


public class Java_Basics03 {

    
    public static void main(String[] args) {
        
        //Exception handling =>   See and  run the Exception1
        
//Basic OOP concepts
    // 1. Encapsulation (Please refer Book.java file)
        
        //Creating a book object
        Book book1 = new Book("Lord of the rings","JRR Tolkein",1954);
        System.out.println(book1.title); //since varibles are public can access directly (not a good practice)
        book1.readBook(); // reading a public method
        
        //using getter and setter to access private variable
        book1.setYear(1955);
        System.out.println(book1.getYear()+"\n\n");
        
        
    // 2. Inheritance (Please refer Chef.java)
        
        Chef myChef = new Chef("Gordan Ramsay",54);
        myChef.makeChicken();
        myChef.makeSpecialDish();
        
        ItalianChef iChef = new ItalianChef("Massimo Botura",67,"Italy");
        iChef.makePasta();
        iChef.makeChicken();//Calling method of Chef class
        iChef.makeSpecialDish();//calling overriden method
        System.out.println("\n\n");
        
        
    // 3. Abstraction (Please refer the vehicle class)

        Bicycle b=new Bicycle();
        b.move();//calling abstract method(which is overriden in bicycle class)
        b.getDescription();//calling method in abstract class
        
        Plane p=new Plane();
        p.move();
        p.getDescription();
        System.out.println("\n\n");
        
        
    // 4. Polymorphism using Interface inheritance (Please refer to interface animal)
        Animal[] animal={
            new Dog(),
            new Cat()
        };
        
        //below example for polymorphism where a single method having many forms
        animal[0].speak();
        animal[1].speak();
        // or a extended for loop can be use
        for(Animal a:animal){
            a.speak();
        }
        
    // 5. Polymorphism another example
        Shape c = new Circle(7);
        Shape r = new Quadrilaterals(3,4);
        
        
        Quadrilaterals s = new Quadrilaterals(5);
        
        System.out.println(c.area());
        System.out.println(r.area());
        System.out.println(s.areaSquare());
        
        
    }
    
}
