import java.util.Scanner;
public class SimpleCalculator{
   public static void main(String[] args){
       boolean userContinue=true;
       while(userContinue){
           
           Scanner input = new Scanner(System.in);
           
           System.out.println("Enter the first number: ");
           int num1 = input.nextInt();
           
           System.out.println("Enter the second number: ");
           int num2 = input.nextInt();
           
           System.out.println("Use one of the operation provided from the menu below.");
           System.out.println("(1) Addition");
           System.out.println("(2) Subtraction");
           System.out.println("(3) Multiplication");
           System.out.println("(4) Division");
           
           int operation = input.nextInt();
           double result=0.00d;
               switch(operation){
                   case 1:
                       result=num1+num2;
                       System.out.println("The sum of two numbers is " + result);
                       break;
                   
                   case 2:
                       result=num1-num2;
                       System.out.println("The difference of two numbers is " + result);
                       break;
                   
                   case 3:
                       result=num1*num2;
                       System.out.println("The product of two numbers is " + result);
                       break;
                   
                   case 4:
                       result=num1/num2;
                       System.out.println("The quotient of two numbers is " + result);
                   break;
                   
                   default:
                       System.out.println("Invalid Operation Input!");
                   
               }
           
           boolean validityTest=true;
           
               while(validityTest){
               System.out.println("Do you want to continue (Y/N)?");
               char continueTest = input.next().toUpperCase().charAt(0);
               
               if(continueTest=='N')
               {
                   userContinue=false;
                   validityTest=false;
               }
               else if(continueTest=='Y'){
                   userContinue=true;
                   validityTest=false;
               }
               else
               {
                   System.out.println("Invalid Input to Exit or Continue. Please try again!");
               }
            }
            input.close();
       }
       
       
       
       System.out.println("Thank you for using this program.");
       
   }
}