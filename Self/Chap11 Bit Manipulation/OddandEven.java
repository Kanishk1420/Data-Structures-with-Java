import java.util.Scanner;

public class OddandEven {
    public static void main(String[] args) {
        System.err.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n & 1) == 0) {
            System.err.println("Its even");
        }
        else {
            System.err.println("Its odd");
        }
        sc.close();
    }
}
