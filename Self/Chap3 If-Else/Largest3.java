import java.util.Scanner;

public class Largest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();
        
        System.out.print("Enter third number (c): ");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("Largest: " + a);
        }
        else if (b > c) {
            System.out.println("Largest: " + b);
        }
        else {
            System.out.println("Largest: " + c);
        }
        
        scanner.close();
    }
}
