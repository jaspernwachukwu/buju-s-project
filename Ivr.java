
import java.util.Scanner;

public class Ivr {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 for English");
        System.out.println("2 for Igbo");
        System.out.println("3 for French");
        System.out.println("4 for Yoruba");

        int user = input.nextInt();


        if (user == 1) {
            System.out.println("Enter 1 for data");
            System.out.println("Enter 2 for transfer");
            user = input.nextInt();

            if (user == 1){
                System.out.println("data");
            }
            if (user == 2){
                System.out.println("transfer");
            }
        }
        if (user == 2) {
            System.out.println("Enter 1 for sharing");
            System.out.println("Enter 2 for caring");
            user = input.nextInt();

            if (user == 1){
                System.out.println("sharing");
            }
            if (user == 2){
                System.out.println("caring");
            }
        }
        if (user == 3) {
            System.out.println("Enter 1 for egg");
            System.out.println("Enter 2 for chrome");
            user = input.nextInt();

            if (user == 1){
                System.out.println("egg");
            }
            if (user == 2){
                System.out.println("chrome");
            }
        }
        if (user == 4) {
            System.out.println("Enter 1 for ewa");
            System.out.println("Enter 2 for agoyin");
            user = input.nextInt();

            if (user == 1){
                System.out.println("ewa");
            }
            if (user == 2){
                System.out.println("agoyin");
            }
        }




    }
}