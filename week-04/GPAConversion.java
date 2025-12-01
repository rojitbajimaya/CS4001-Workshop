import java.util.Scanner;
public class GPAConversion{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        boolean gpaValidity=false;
        float gpa;
        //Creating Scanner object and Declaration of GPA Validity and GPA. 
        
        
        do { 
            System.out.println("Enter the GPA range from 0.00 to 4.00:");
                gpa= input.nextFloat(); //Input for GPA.
                
                if((gpa<0.00) && (gpa>4.00)) //Checking Validity.
                {
                    System.out.println("The entered GPA is not valid. Enter the GPA from 0.00 to 4.00");
                    gpaValidity=false;
                    continue;
                }
                else
                {
                    gpaValidity=true;
                }
                    
        } while(gpaValidity==false);
        //Loop to verify if the GPA is within a valid range.        
        
        if(gpa<1.00){System.out.println("The GPA is equivalent to F");} 
        
            else if(gpa<1.50){System.out.println("The GPA is equivalent to E");}            
                
            else if(gpa<2.50){System.out.println("The GPA is equivalent to D");}             
                    
            else if(gpa<3.00){System.out.println("The GPA is equivalent to C");}                  
                           
            else if(gpa<3.20){System.out.println("The GPA is equivalent to B");}
                                    
            else if(gpa<3.50){System.out.println("The GPA is equivalent to A");}
                                        
            else if(gpa<=4.00){System.out.println("The GPA is equivalent to A+");}
        //Output according if condition if the condition is fulfilled.
        input.close();
        }   
}