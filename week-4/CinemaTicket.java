import java.util.Scanner;
public class CinemaTicket{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double baseFare=0.00d;
        double totalFare=0.00d;
        
        boolean ageValidityChk=true;
        boolean movieLanguageChk=true;
        boolean studValidityChk=true;
        boolean festValidityChk=true;
        
        System.out.println("Enter the age based on (Child/Adult/Senior):");
        String ageGroup = input.next().toUpperCase();
        
        System.out.println("Enter the movie you are about to watch (English/Hindi/Nepali):");
        String movieSurcharge = input.next().toUpperCase();
        
        System.out.println("Are you a student? (Y/N)");
        char studentChkChar = input.next().toUpperCase().charAt(0);
        
        System.out.println("Is the movie being watched in a festival day? (Y/N)");
        char festivalDayChar = input.next().toUpperCase().charAt(0);
        
        do{
            if(ageGroup.equals("CHILD"))
                {
                   baseFare=150.0d;
                }
                else if(ageGroup.equals("ADULT"))
                {
                    baseFare=250.0d;   
                }
                else if(ageGroup.equals("SENIOR"))
                {
                    baseFare=200.0d;
                }
                else
                {
                    ageValidityChk=false;
                    System.out.println("The entered age group is invalid.");
                    continue;
                }
        
            if(ageGroup.equals("ENGLISH"))
                {
                    totalFare = baseFare + 100.0;
                }
                else if(ageGroup.equals("HINDI"))
                {
                    totalFare = baseFare +  50.0; 
                }
                else if(ageGroup.equals("NEPALI"))
                {
                    totalFare = baseFare;
                }
                else
                {
                    movieLanguageChk=false;
                    System.out.println("The entered movie language group is invalid.");
                    continue;
                }
                
            switch(studentChkChar)
                {
                    case 'Y': 
                        totalFare = totalFare * 0.8; 
                        break;
                    
                    case 'N': 
                        totalFare = totalFare; 
                        break;
                        
                    default:
                        studValidityChk=false;
                        System.out.println("The entered option for the student group is invalid.");
                        continue;
                }
                
            switch(festivalDayChar)
                {
                    case 'Y': 
                        totalFare = totalFare * 0.85; 
                        break;
                    
                    case 'N': 
                        totalFare = totalFare; 
                        break;
                        
                    default:
                        festValidityChk=false;
                        System.out.println("The entered option for festival day is invalid.");
                        continue;
                }
                
        }while((ageValidityChk && movieLanguageChk && studValidityChk && festValidityChk)==false);
        
        System.out.println("The final ticket price is Rs. " + totalFare);
        
    }
}