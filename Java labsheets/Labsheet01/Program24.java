import java.util.Scanner;

public class Program24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == n) {
            System.out.println("The number is a Perfect Number.");
        } else {
            System.out.println("The number is not a Perfect Number.");
        }

        sc.close();
    }
}
