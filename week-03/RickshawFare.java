import java.util.Scanner;

public class RickshawFare{
    
    public static void main(String[] args){
    
    final double BASE_FARE = 25.0d;
    final double NIGHT_FARE= 500.0d;
    
    double totalFare = 0.00d;           //Declaration of Base Price and Night Fare. (Both have constant values)
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the distance in kilometers: ");
    int distance = input.nextDouble();          //Input from Scanner for distance in kilometers.
    
    System.out.println("Enter the time in minutes: ");
    int time = input.nextDouble();              //Input from Scanner for time in minutes.
    
    System.out.println("Enter if the customer is local or not(Y/N): ");
    String isLocal = input.next();          //Input from Scanner to check if the customer is local.
    
    System.out.println("Enter if the customer is travelling at night(Y/N): ");
    String isNight = input.next();          //Input from Scanner to check if the customer is travelling at night.
    
    input.close();

    double distanceFare = distance * 20.0d;
    double timeFare = (time * 1.50d);
    //Time and Distance Fare added, could be changed according to preference.
    
    totalFare = BASE_FARE + distanceFare + timeFare ;
    //Calculating fare based on distance and time with its fares included. No additional fares for night travel or discount for locals.
    
    /*
    totalFare = (isLocal == "Y" || isLocal == "y") ? (totalFare * 0.9) : totalFare;
    totalFare = (isNight == "Y" || isLocal == "y") ? (totalFare + NIGHT_FARE) : totalFare;
    
    only if both string variables refer to the exact same object in memory. 
    This is generally not recommended for comparing string content, as two strings with 
    identical content might still be different objects in memory.
    
    Use of .equal is prefered when comparing since == compares the memory addresses or references 
    of the objects, returns true only if both references point to the exact same object in memory, 
    does not compare the content of the objects
     */ 
    
    totalFare = (isLocal.equals("Y") ||isLocal.equals("y")) ?  (totalFare * 0.9) : totalFare;
    totalFare = (isNight.equals("Y") ||isNight.equals("y")) ?  (totalFare + NIGHT_FARE) : totalFare;
    
    //Calculating the total fare after local's discount and addition of night fares if needed.
    
    System.out.println("The total fare to be paid by the customer is Rs. " + totalFare);    //Output based on the calculations.
    
    }
}
