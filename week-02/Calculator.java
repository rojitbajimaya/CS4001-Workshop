import java.util.Scanner; 


public class Calculator {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);  // New Object created to take input from the user.
        
        
        System.out.println("Enter the first integer number :");
        int num1 = input.nextInt();
        
        System.out.println("Enter the second integer number :");
        int num2 = input.nextInt();
        
        //Takes 2 integer value from the user to be calculated.
        
        
        System.out.println("The first number is " + num1);
        
        System.out.println("The second number is " + num2);
        
        //Output the 2 numbers entered by the user.
        
        
        input.close();
        
        int sum = num1 + num2;
        
        System.out.println("The sum of two given integers is " + sum);
       
        
    }
    
}
    
