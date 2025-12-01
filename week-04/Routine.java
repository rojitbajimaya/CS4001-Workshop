import java.util.Scanner;
public class Routine{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day to get the routine");
        String day = input.nextLine().toUpperCase();
        
        switch (day){
        
            case "SUNDAY":
                System.out.println("Lectures");
                System.out.println("Computer Hardware & Software Architectures");
                System.out.println("Logic and Problem Solving");
                break;
        
            case "MONDAY":
                System.out.println("Lectures");
                System.out.println("Programming");
                System.out.println("Introduction to Information Systems");
                break;
        
            case "TUESDAY":
                System.out.println("Tutorial");
                System.out.println("Logic and Problem Solving");
                System.out.println("Introduction to Information Systems");
                break;
            
            case "WEDNESDAY":
                System.out.println("Tutorial");
                System.out.println("Computer Hardware & Software Architectures");
                System.out.println("Programming");
                break;
            
            case "THURSDAY":
                System.out.println("Workshop");
                System.out.println("Logic and Problem Solving");
                System.out.println("Introduction to Information Systems");
                break;
            
            case "FRIDAY":
                System.out.println("Workshop");
                System.out.println("Computer Hardware & Software Architectures");
                System.out.println("Programming");
                break;
            
            case "SATURDAY":
                System.out.println("There is no classes on Saturday.");
                break;
                
            default:
                System.out.println("The entered day is invalid!");
                
        }
    }
}