import java.util.Scanner;

public class NReverseNumber {
    public static void main(String[] args) {
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        while (n!=0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n/10;
        }
        System.out.println("Reversed number: " + rev);
        sc.close();
    }
}
