import java.util.Scanner;	
 public class Health{
  public static void main(String[] args ){
 
Scanner input = new Scanner (System.in);
 
 System.out.print("weight : ");// weight should be in pounds;
 Double number1 = input.nextDouble();

 System.out.print("height : "); // height should be in inches ;
 double number2 = input.nextDouble();

 double d = number2 * 0.0254;
 double z = d * d ;
 double y = number1*0.4536 / z ;
  
 System.out.printf("BMI is %.4f", y);
 
						

 }
}

