
package java_basics03;

//Inheritance
class Chef {
    
    String name;
    int age;

    Chef(String name, int age) {//constructor
        this.name = name;
        this.age = age;
    }

    void makeChicken() {
        System.out.println("The chef makes chicken");
    }

    void makeSpecialDish() {
        System.out.println("The chef makes special dish");
    }
    
}

class ItalianChef extends Chef{
    public String ctryOfOrigin;
    
    ItalianChef(String name,int age,String ctryOfOrigin){
        super(name,age);
        this.ctryOfOrigin = ctryOfOrigin;
    }
    public void makePasta(){
        System.out.println("Italian chef makes pasta");
    }
    @Override
    public void makeSpecialDish(){
        System.out.println("The chef makes chicken parm");
    }
}
