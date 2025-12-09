import java.util.Scanner;
public class TableGenerator{
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the number you want multiplication table of: ");
      int num = input.nextInt();
      
      for(int i=1; i<=10; i++){
          System.out.println(num + " X " + i + " = " + (num*i));
      }
      
      input.close();
  }
}