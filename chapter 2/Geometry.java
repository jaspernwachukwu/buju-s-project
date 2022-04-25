import java.util.Scanner;

 public class Geometry {
  public static void main(String[] args ) {

  Scanner input = new Scanner (System.in);

 System.out.print("side1: ");
 double y1= input.nextDouble();
 double x1 = input.nextDouble();


 System.out.print("side2: ");
 double y2 = input.nextDouble();
 double x2 = input.nextDouble();
 

 System.out.print("side3: ");
 double y3 = input.nextDouble();
 double x3= input.nextDouble();
 

 double s = (y1*x1)+(y2*x2)+(y3*x3) /2;	

System.out.printf( "the answer is %.3f " , s);

 


 
  }
} 