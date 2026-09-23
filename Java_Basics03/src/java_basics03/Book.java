
package java_basics03;


class Book {
    
    public String title;
    public String author;
    private int year; //Variable made private for Encapsulation
    public static String staticAttribute = "My static attribute";// Static attributes belongs to class rather to object
    
    public void readBook(){
        System.out.println("Reading "+this.title+" by "+this.author);
    }
    public static void stMethod(){
        System.out.println("This is a static method.");
    }
    
    //constructor 
    public Book(String title,String author,int year){
        this.title = title;
        this.author = author;
        this.year  = year;
    }
    
    //getters and setters
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return this.year;
    }
}
