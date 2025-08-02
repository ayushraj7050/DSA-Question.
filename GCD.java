
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter first number: ");
        int x = scanner.nextInt();

        System.out.print("Enter second number: ");
        int y = scanner.nextInt();

        int smaller = x < y ? x : y;
        int gcd = 1;

        for (int i = 1; i <= smaller; i++) {
            if (x % i == 0 && y % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD of " + x + " and " + y + " is: " + gcd);

        scanner.close();
    }
}
