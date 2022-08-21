
package java_basics03;


class Book {
    
    public String title;
    public String author;
    public static String staticAttribute = "My static attribute";// Static attributes belongs to class rather to object
    
    public void readBook(){
        System.out.println("Reading "+this.title+" by "+this.author);
    }
    public static void stMethod(){
        System.out.println("This is a static method.");
    }
    
    //constructor 
    Book(String title,String author){
        this.title = title;
        this.author = author;
    }
    
    //getters and setters
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
}
