import java.util.Scanner;
public class QuestionBreak {
    public static void main(String[] args) {
        int n;
        // Keep Entering the numbers till user enters a multiple of 10
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the Number");
            n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println("Multiple of 10 found "+ n);
                break;
            }
        }
        sc.close();
    }
}
