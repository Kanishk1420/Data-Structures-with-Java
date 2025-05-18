import java.util.Scanner;
public class Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String");
        String a = sc.next();
        sc.nextLine();  // consume the remaining newline
        System.out.println("String");
        String c = sc.nextLine();
        System.out.println("Int");
        int b = sc.nextInt();
        System.out.println("Boolean");
        boolean d = sc.nextBoolean();
        System.out.println(d);
        System.out.println(a);
        System.out.println(c);
        System.out.println(b);
        sc.close();
    }
}
