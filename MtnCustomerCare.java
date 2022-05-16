import java.util.Scanner;

public class MtnCustomerCare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 for English");
        System.out.println("2 for Igbo");
        System.out.println("3 for French");
        System.out.println("4 for Yoruba");

        int user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("Enter 1 for data");
                System.out.println("Enter 2 for transfer");
                user = input.nextInt();
                switch (user){
                    case 1:
                        System.out.println("data");
                        break;
                    case 2:
                        System.out.println("transfer");
                        break;
                    default:
                        System.out.println("wrong selection");
                }
break;

            case 2:
                System.out.println("Enter 1 for sharing");
                System.out.println("Enter 2 for caring");
                user = input.nextInt();
                switch (user){
                    case 1:
                        System.out.println("sharing");
                        break;
                    case 2:
                        System.out.println("caring");
                        break;
                    default:
                        System.out.println("wrong selection");
                }
                break;
            case 3:
                System.out.println("Enter 1 for egg");
                System.out.println("Enter 2 for chrome");
                user = input.nextInt();
                switch (user){
                    case 1:
                        System.out.println("egg");
                        break;
                    case 2:
                        System.out.println("chrome");
                        break;
                    default:
                        System.out.println("wrong selection");
                }
                break;
            case 4:
                System.out.println("Enter 1 for ewa");
                System.out.println("Enter 2 for agoyin");
                user = input.nextInt();
                switch (user){
                    case 1:
                        System.out.println("ewa");
                        break;
                    case 2:
                        System.out.println("agoyin");
                        break;
                    default:
                        System.out.println("wrong selection");
                }
                break;
            default:
                System.out.println("wrong selection"); 

        }
    }
}