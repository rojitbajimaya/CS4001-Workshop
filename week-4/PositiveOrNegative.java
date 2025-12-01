import java.util.Scanner;
public class PositiveOrNegative{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the integer:");
        int num = input.nextInt();
        
        if( num == 0 )
        {
            System.out.println("The number is Zero.");
        }
            else if( num > 0 )
            {
                System.out.println("The number is Positive.");
            }
            else if( num < 0 )
            {
                System.out.println("The number is Negative.");
            }
            else
            {
                System.out.println("Invalid Input!");
            }
        input.close();
    }
}