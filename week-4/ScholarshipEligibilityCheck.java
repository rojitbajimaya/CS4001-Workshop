import java.util.Scanner;
public class ScholarshipEligibilityCheck{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        boolean scholarEligibility=false;
        
        System.out.println("Enter the GPA of the student Range[0.00-4.00]");
        float gpa = input.nextFloat();
        
        System.out.println("Enter the Attendance of the student Range[0%-100%]");
        int attendance = input.nextInt();
        
        System.out.println("Enter the Attitude Score of the student Range[1-10]");
        short attitudeScore = input.nextShort();
        
        
        if(gpa>=3.20){
            
            if(attendance>80){
                
                if(attitudeScore<5){
                    scholarEligibility=true;
                }
            }
        }
        
        if(scholarEligibility=true)
        {
            System.out.println("The student is eligible for a scholarship");
        }
        else
        {
            System.out.println("The student is NOT eligible for a scholarship");
        }
        
        input.close();
    }
}