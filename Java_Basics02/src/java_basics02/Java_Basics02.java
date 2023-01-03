package java_basics02;

import java.util.ArrayList;
import java.util.Scanner;


public class Java_Basics02 {

    
    public static void main(String[] args) {
        
        //USER INPUT
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        //Taking user input string value
        String input = in.nextLine();  //.nextDouble(),.nextInt() for double and integer inputs;
        System.out.println("Hello "+input);
        System.out.println(in.hasNextLine());//checks whether there is an input if so return true
        System.out.println("\n\n");

        //ARRAYS
        int luckyNumbers[] = {1,5,8,12,53,35};
        System.out.println(luckyNumbers[0]);
        System.out.println(luckyNumbers.length);
        System.out.println("\n\n");
        
       //N DIMENSIONAL ARRAYS
        int numberGrid[][]  = {{1,3},{3,4}};
        numberGrid[0][1] = 99;
        System.out.println(numberGrid[0][0]);
        System.out.println(numberGrid[0][1]);
        System.out.println("\n\n");
        
        //ARRAYLIST
        ArrayList<String> friends = new ArrayList<String>();
        friends.add("Oscar");
        friends.add("Angela");
        friends.add("Kevin");
        
        friends.remove("Oscar");
        System.out.println(friends.toString());//print array
        System.out.println(friends.get(0));
        System.out.println(friends.contains("Oscar"));//return true or false
        System.out.println(friends.size());
        System.out.println("\n\n");
        
        //METHODS
        int sum = addNumbers(4,60);  // addNumbers method is at the end of the code
        System.out.println(sum);
        
        //IF STATEMENTS 
        boolean isStudent = false;
        boolean isSmart  = false;
        
        if(isStudent&&isSmart){
            System.out.println("You are smart student");
        }
        else if(isStudent&&!isSmart){
            System.out.println("You are studetn not smart");
        }
        else{
            System.out.println("You are not a student nor smart");
        }
        
        if(1<3){
            System.out.println("Number comparison was true");
        }
        if('a'<'b'){
            System.out.println("Character comaparison was true");
        }
        if("dog".equals("dog")){
            System.out.println("String comparison was true");
            System.out.println("\n\n");
        }
        
        //SWITCH 
        char myGrade = 'F';
        switch(myGrade){
            case 'A':System.out.println("You passed.");break;
            case 'F': System.out.println("You fail");break;
            
            default:System.out.println("Invalid grade");
        }
        
        //WHILE LOOPS
        int index = 1;
        while(index <=5){
            System.out.println(index);
            index++;
        }System.out.println("\n\n");
        
        do{
            System.out.println(index);
             index--;
          }while(index>0);System.out.println("\n\n");

        //FOR LOOP
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
        System.out.println("\n\n");
        
        for(int num :luckyNumbers){
               System.out.print(num+",");
         }
        
        
        
    }
    //STATIC METHOD (which is belong to class rather than the object
    public static int addNumbers(int num1,int num2){
        return num1+num2;
    }
    
}
