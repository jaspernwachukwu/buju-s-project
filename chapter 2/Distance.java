import java.util.Scanner;

 public class Distance {
    public static void main(String[] args ){

    Scanner input= new Scanner(System.in);

  System.out.print("the driving distance: ");
  float number1 = input.nextFloat();

  System.out.print("miles per gallon: ");
  float number2 = input.nextFloat();

  System.out.print("price per gallon: ");
  float number3 = input.nextFloat();
  
float d = number1/number2 * number3;

  System.out.printf("the cost of driving is %.2f: ", d);




      }
   }