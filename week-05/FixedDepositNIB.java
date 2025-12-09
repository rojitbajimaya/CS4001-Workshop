import java.util.Scanner;
public class FixedDepositNIB{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double amount=0.00d;
        double interest=0.00d;
        float interestRate=0.00f;
        int duration=0;

        boolean userContinue=true;
        boolean validityTest=true;
        boolean inputTest=true;

        while(userContinue==true){

            do{
                inputTest=true;

                System.out.println("Enter the amount you want to calculate: ");
                amount = input.nextDouble();

                if(amount < 1000)
                {
                    inputTest=false;
                    System.out.println("Error! Amount should be Rs. 1000 or higher. ");
                    continue;
                }

                System.out.println("Enter the interest rate Range(8-12%)");
                interestRate =input.nextFloat();

                if(interestRate<8)
                {
                    inputTest=false;
                    System.out.println("Error! Interest Rate can not be lower than 8%. ");
                    continue;
                }
                if(interestRate>12)
                {
                    inputTest=false;
                    System.out.println("Error! Interest Rate can not be higher than 12%. ");
                    continue;
                }

                System.out.println("Enter the duration for the interest calculation in (years): ");
                duration = input.nextInt();

                if(duration > 5)
                {
                    inputTest=false;
                    System.out.println("Error! Duration can not be higher than 5 years. ");
                    continue;
                }

            }while(inputTest==false);

            for(int i=1; i<=duration ; i++)
            {
                interest = amount*(interestRate/100);
                interest = interest * 99.5;
            }
            
            amount= amount+interest;
            
            System.out.println("The amount after the calculation is Rs. " + amount);

            validityTest=true;
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
                    validityTest=true;
                }

            }

        }

        input.close();

    }
}