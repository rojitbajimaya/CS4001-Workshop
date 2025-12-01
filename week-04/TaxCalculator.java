import java.util.Scanner;
public class TaxCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the annual income in NPR to calculate taxable income: ");
        double income = input.nextInt();
        double taxToPay=0.00d;
        boolean validity=true;
        
            if( income <= 500000 )
            {
                taxToPay = income * 0.01;
            }
            
            else if( income >= 500001 && income<=700000 )
            {
                taxToPay = 5000 + ( income - 500000 ) * 0.1 + taxToPay;
            }
            
            else if( income >= 700001 && income<=1000000 )
            {
                taxToPay = 15000 + ( income - 700000 ) * 0.2 + taxToPay;
            }
            
            else if( income >= 1000001 && income<=2000000 )
            {
                taxToPay = 35000 + ( income - 1000000 ) * 0.3 + taxToPay;
            }
            
            if( income >= 2000001 && income<=5000000 )
            {
                taxToPay = 335000 + ( income - 2000000 ) * 0.36 + taxToPay;
            }
            
            else if( income >= 5000000 )
            {
                taxToPay = 1135000 + ( income - 5000000 ) * 0.39 + taxToPay;
            } 
            else{
                validity=false;
            }
            
            if(validity)
            {
                System.out.println("The tax to pay for the individual is Rs. " + taxToPay);
            }
            else
            {
                System.out.println("The entered input from the user is invalid!");
            }
            input.close();
    }
}