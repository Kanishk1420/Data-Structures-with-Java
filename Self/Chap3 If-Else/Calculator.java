import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Boring Calculator");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the operator");
        char c = sc.next().charAt(0);
        switch(c){
        case '+' : System.out.println(a+b);
        break;
        case '-': System.out.println(a-b);
        break;
        case '*': System.out.println(a*b);
        break;
        case '/': System.out.println(a/b);
        break;
        default: System.out.println("Wrong Operator");
        }
        sc.close();
        
    }
}
