import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
    // int a = 12;
    // int b = 23;
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = a*b;
    System.out.println("Sum of Product "+c);
    sc.close();  
}
}
