import java.util.Scanner;

public class QuestionContinue {
    public static void main(String[] args) {
        // Display all numbers entered by user except multiples of 10 not stooping it but i dont need to shown that
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter the number");
                n = sc.nextInt();
                if (n % 10 == 0) {
                    continue;
                }
                System.out.println("Output is "+n); 
            }
        }
    }
}
