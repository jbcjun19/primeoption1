import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String []Args) {
        while (true) {
            boolean notPrime = false;
            System.out.println("Please enter in a number from : ");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            scan.nextLine();
            for(int i=2;i<number;i++) {
                if(number%i==0) {
                    notPrime = true;
                }
            }
            if (notPrime == false) {
                System.out.println("It's a prime number!");
            } else {
                System.out.println("It's not a prime number!");
            }
            System.out.println("Do you want to play again? (Y|N) ");
            String answer1 = scan.nextLine();
            if (answer1.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}
