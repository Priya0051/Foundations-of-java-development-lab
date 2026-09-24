import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double num = sc.nextDouble();

        int integerValue = (int) num;

        System.out.println("Floating-point value: " + num);
        System.out.println("Integer value after casting: " + integerValue);

        sc.close();
    }
}