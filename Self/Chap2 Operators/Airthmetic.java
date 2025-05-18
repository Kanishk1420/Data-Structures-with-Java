import java.util.*;
public class Airthmetic{
    public static void main(String[] args) {
        // Binary Operator
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int sum = A + B;
        int sub = A - B;
        int mul = A * B;
        int div = A / B;
        int mod = A % B;
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + sub);
        System.out.println("The product is: " + mul);
        System.out.println("The quotient is: " + div);
        System.out.println("The remainder is: " + mod);
        // Unary Operator
        int a = 12;
        int b = a++;
        int c = ++a;
        System.out.println("a is = "+a+" b is = "+b+" c is = "+c); 
        scanner.close();
    }
}