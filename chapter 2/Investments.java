import java.util.Scanner;

public class Investments {
   public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("investment amount: ");
  float a = input.nextFloat();
  
  
  System.out.print("annual interest rate: ");
  float b = input.nextFloat(); // should be in percentage

  
  System.out.print("number of years: ");
  int c = input.nextInt();

  float d =  a * (1 + b/100 * c);
  
 
 System.out.printf("number of years %f", d);
  








}
}