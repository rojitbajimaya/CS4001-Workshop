public class LoopTest{
    public static void main(String[] args){
       /*
        int i=2;
        do
        {
            System.out.println(i);
            i+=2; 
        }while(i<=10);
    
       int sum=0;
       for(int i=1;i<=10;i++){
           sum = sum +i ;
       }
       System.out.println(sum);
    
    */  
    int num1=1;
    int num2=1;
    int num3=0;
    for(int i=1;i<=10;i++){
        num3=num1+num2;
        System.out.print(num1+" "+num2+" "+num3+" ");
        
        num1=num2+num3;
        num2=num1+num3;
    }
    /*

    for(int i=5;i>=1;i--)
        {   
        for(int j=1;j<=i;j++)
            {
        
                System.out.print(" ");
    
            }
        for(int k=5;k>=i;k--)
            {
        
                System.out.print("*");
    
            }    
        for(int j=5;j>=i;j--)
            {
        
                System.out.print("*");
    
            }
        for(int k=1;k<=i;k++)
            {
        
                System.out.print(" ");
    
            }    
        for(int j=1;j<=i;j++)
            {
        
                System.out.print(" ");
    
            }
        for(int k=5;k>=i;k--)
            {
        
                System.out.print("*");
    
            }    
        for(int j=5;j>=i;j--)
            {
        
                System.out.print("*");
    
            }
        for(int k=1;k<=i;k++)
            {
        
                System.out.print(" ");
    
            }      
            System.out.println();
            
        }
        */
    }
}
