import java.util.Scanner;
public class OddorEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2==0) {
            System.out.println(a+" is even");
        }
        else {
            System.out.println(a+" is odd");
        }
        sc.close();
    }
}
