
package java_basics03;


class Exception1 {

        //Exception handling
        /* 
        There are mainly to two methods to handle exception
                    1.Using try-catch
                    2.Use throw/throws
        */
    
    static void checkAge(int age) {//Checking age
        if (age<18)
            throw new ArithmeticException("Access denied!");
        else
            throw new ArithmeticException("Access granted");
    }
    
    
    public static void main(String[] args) {
        
      
        try{
            int division = 10/0;
            throw new ArithmeticException("Can't add numbers");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        try{
        Exception1.checkAge(30);//Separate class(Exception1 has created
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
        //"Usually always finally block executes whether or not exception occured!
            System.out.println("Finally block is here");
        }
    }
    
}
/*

There are several exception types such as
        ArrayIndexOutOfBoundsException
        NullPointerException
        IOException
        
*/