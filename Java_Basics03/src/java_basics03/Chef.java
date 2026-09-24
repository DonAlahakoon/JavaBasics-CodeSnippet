
package java_basics03;

//Inheritance

//Java doesn't support multiple inheritance, only single inheritance(which means a subclass can only have 1 parent class)
//but Java support multi level inheritance
//Multiple inheritance can be achieved using interfaces

public class Chef {
    
    private String name;
    private int age;

    public Chef(String name, int age) {//constructor
        this.name = name;
        this.age = age;
    }

    public void makeChicken() {
        System.out.println("The chef makes chicken");
    }

    public void makeSpecialDish() {
        System.out.println("The chef makes special dish");
    }
    
}
// NB: In here we are not using 'public' access modifier because a single file can only have one public class
class ItalianChef extends Chef{ // This is inheritance
    
    public String ctryOfOrigin;
    
    public ItalianChef(String name,int age,String ctryOfOrigin){
        super(name,age);
        this.ctryOfOrigin = ctryOfOrigin;
    }
    public void makePasta(){
        System.out.println("Italian chef makes pasta");
    }
    @Override
    public void makeSpecialDish(){
        System.out.println("The Italian chef makes special dish");
    }
}
