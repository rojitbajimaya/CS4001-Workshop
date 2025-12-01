import java.util.Scanner;
public class EvenOrOdd{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the integer:");
        int num = input.nextInt();
        
        if ( num < 0 )
        {
          num = -num;
        }
        
        if( num == 0 )
        {
            System.out.println("The number is Zero which is not Even or Odd.");
        }
            else if( num % 2 == 0 )
            {
                System.out.println("The number is Even.");
            }
            else if( num % 2 == 1 )
            {
                System.out.println("The number is Odd.");
            }
            else
            {
                System.out.println("Invalid Input!");
            }
        input.close();
    }
}