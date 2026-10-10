import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println("The year is a Leap Year.");
        } else if (year % 100 == 0) {
            System.out.println("The year is not a Leap Year.");
        } else if (year % 4 == 0) {
            System.out.println("The year is a Leap Year.");
        } else {
            System.out.println("The year is not a Leap Year.");
        }

        sc.close();
    }
}
