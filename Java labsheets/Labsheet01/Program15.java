import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }

        if (sum == original) {
            System.out.println("The number is an Armstrong Number.");
        } else {
            System.out.println("The number is not an Armstrong Number.");
        }

        sc.close();
    }
}
