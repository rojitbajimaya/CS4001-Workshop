import java.util.Scanner;
public class Guess{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int guessNum= 5;
        
        for (int i=1;i<=3;i++)
        {
            
            System.out.println("Enter the guess number from 0-9:");
            int inputGuess = input.nextInt();
            if(guessNum==inputGuess)
            {
                System.out.println("The entered number is CORRECT!");
                break;
            }
            else
            {
                System.out.println("The entered number is incorrect!");
            }
        }
    }
}