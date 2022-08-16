
package java_basics01;

public class Java_Basics01 {


    public static void main(String[] args) {
      
        //Variable types
        String name = "Mike";
        char testGrade = 'A';

        byte age = 0;
        short age1 = 10;
        int age2 = 20;
        long age3 = 30L;

        float gpa = 2.5f;
        double gpa1= 3.5;

        boolean isTall = true;
        
        //printing
        System.out.println("Your name is " +name);
        System.out.printf("Your name is %s \n",name+"\n");
        
        /*
        %f -> double or float
        %d -> integer
        %s -> string
        %c -> character
        %b -> boolean
        */
        
      //Casting and Converting
        System.out.println("(int)3.14");
        System.out.println((double)3+"\n");
        
        int intFromString = Integer.parseInt("50");
        double doubleFromString   = Double.parseDouble("24.67");
        
        System.out.println(100 + intFromString);
        System.out.println(100 + doubleFromString);
        
        
        //String methods
        String greeting = "Hello";
        
        System.out.println(greeting.length());
        System.out.println(greeting.charAt(0));
        System.out.println(greeting.indexOf("llo"));
        System.out.println(greeting.indexOf("z"));
        System.out.println(greeting.substring(2));
        System.out.println(greeting.substring(1,3)+"\n\n");
        
        //Numbers
        System.out.println(2*3);
        System.out.println(10%3);
        System.out.println(1+2*3);
        System.out.println(10/3.0+"\n\n");
        
        
        int num = 10;
        num+=100;
        System.out.println(num);
        num++;
        System.out.println(num);
        
        
        //Math class has useful math methods
        System.out.println(Math.pow(2, 4));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.round(2.7));
    }
    
}
