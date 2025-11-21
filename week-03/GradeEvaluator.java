import java.util.Scanner;

public class GradeEvaluator{
    
    public static void main(String[] args){
        
        Scanner inputNum= new Scanner(System.in);          //Creating inputNum Object to sScan
        
        System.out.println("Enter the grade as integer: ");
        
        int grade = inputNum.nextInt();   //Input Using Scanner.
        
        System.out.println((grade>=40) ? "Pass" : "Fail");   //Checking for the value if it is greater than or less than 40 using ternary operator.
        
        inputNum.close();           //Closing Scanner.
    }
    
}