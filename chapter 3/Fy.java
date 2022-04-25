import java.util.Scanner;
  public class Fy{
    public static void main(String [] args){
Scanner input = new Scanner(System.in);
  
System.out.print("guess the number :" );
int h = input.nextInt();

if ( h ==7 ){
   System.out.print("CORRECT");
}

if (h < 7 ){
   System.out.print("TOO LOW");
}

 if (h > 7 ){
   System.out.print("TOO HIGH ");
}






}

}