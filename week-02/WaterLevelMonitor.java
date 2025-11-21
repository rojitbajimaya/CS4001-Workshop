import java.util.Scanner;

public class WaterLevelMonitor{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the water level in litres as an integer number: ");
        int waterLevel = input.nextInt(); //Input taken from User with Scanner.
        
        String waterStatus = (waterLevel >= 1000) ? "WARNING: Water level has reached 1000L or more!" : "Status: Normal";
        //Checking the status of water if greater than 1000 litres outputs a warning.

        System.out.println(waterStatus);        
        
        //System.out.println((waterLevel >= 1000) ? "WARNING: Water level has reached 1000L or more!" : "Status: Normal");
        
        input.close();
        
    }
}