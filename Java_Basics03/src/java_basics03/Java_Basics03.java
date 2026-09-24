
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
        System.out.println(book1.getYear());
        //Calling static component(Static means component belongs to class rather than the object)
        Book.stMethod();
        System.out.println(Book.staticAttribute+"\n\n");
        
        
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

        Vehicle b=new Bicycle(); //upcasting (creating object of child class with parent class reference variable)
        b.move();//calling abstract method(which is overriden in bicycle class)
        b.getDescription();//calling method in abstract class
        
        
        Vehicle p=new Plane();
        p.move();
        p.getDescription();
        System.out.println("\n\n");
        
        Plane p2 = new Plane(); //downcasting (creating object of child class with child class reference variable)
        p2.vehicleType(); //This method can only be called by the object of Plane class not by the object of Vehicle class because it is not present in Vehicle class.
        
        
    // 4. Polymorphism using Interface inheritance (Please refer to interface animal)
        Animal[] animal={ //upcasting
            new Dog(),
            new Cat()
        };
        
        //below example for polymorphism where a single method having many forms
        animal[0].speak();
        animal[1].speak();
        // or an extended for loop can be use
        for(Animal a:animal){
            a.speak();
        }
        
    // 5. Polymorphism another example
        Shape c = new Circle(7);
        Shape r = new Rectangle(3,4);
        Shape s = new Square(5); // This is an example for polymorphism where a single method having many forms
        
        
        Quadrilaterals s2 = new Square(6);
        
        System.out.println(c.area());
        System.out.println(r.area());
        System.out.println(s.area());
        System.out.println(s2.area());

        // only an object of Quadrilaterals or square or rectangle class can call the method quadrilateralType() because it is not present in Shape class
        System.out.println(s2.quadrilateralType());
        s2.description();


        
        
    }
    
}
