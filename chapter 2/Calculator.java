import java.util.Scanner;

public class Calculator{
  public static void main(String[] arg ) {

  Scanner bryte = new Scanner (System.in);

  System.out.println("enter the first number:");
  int firstNumber = bryte.nextInt();
 

 System.out.print("enter the second number:");
 int secondNumber = bryte.nextInt();
 

 int product = firstNumber * secondNumber;
 int diff =  firstNumber - secondNumber;
 int quotient = firstNumber / secondNumber;
 int sum = firstNumber + secondNumber;
   
System.out.printf("the product of the numbers is %d%n", product);
System.out.printf("the diff of the numbers is %d%n", diff);
System.out.printf("the quotient of the numbers is %d%n", quotient);
System.out.printf("the sum of the numbers is %d%n", sum);



 
  }



}