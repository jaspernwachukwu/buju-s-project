import java.util.Scanner;
  public class FinancialApplication {
      public static void main(String[] args ){
      
   Scanner input = new Scanner(System.in);
  
  System.out.print("balance:");
  float number2= input.nextFloat();

  System.out.print("annualInterestRate:");
  float number3 = input.nextFloat();

  float y = number3/1200 * number2 ;

   System.out.printf("the interest is %.2f", y );

  





}
}