import java.util.Scanner;
public class DiscountCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double finalPrice = 0d;
        
        System.out.println("Discount Menu");
        System.out.println("(A)--->60%");
        System.out.println("(B)--->40%");
        System.out.println("(C)--->20%");
        System.out.println("(D)--->10%");
        
        System.out.println("Enter the marked price to apply discount on:");
        double markedPrice = input.nextDouble();
        
        System.out.println("Choose one of the option from above menu to apply discount:");
        String discountString = input.next();
        
        char discount = discountString.charAt(0);
        boolean validity = true;
        
        switch (discount){
        
            case 'A':
                finalPrice = markedPrice * 0.4;
                break;
        
            case 'B':
                finalPrice = markedPrice * 0.6;
                break;
        
            case 'C':
                finalPrice = markedPrice * 0.8;
                break;
            
            case 'D':
                finalPrice = markedPrice * 0.9;
                break;
                
            default:
                validity = false;
                System.out.println("The entered option for discount is invalid!");
        }
        
        if(validity==true)
        {
            System.out.println("The price of the item after applying discount is Rs. " + finalPrice);
        }
        else
        {
            System.out.println("The price can not be calculated according to the input option.");
        }
        input.close();
    }
}