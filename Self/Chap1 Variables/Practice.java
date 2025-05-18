import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b = scanner.nextInt();
        System.out.println("Enter c");
        int c = scanner.nextInt();
        int avg = a + b + c / 3;
        int sq = a * a;
        System.out.println("Avg is " + avg);
        System.out.println("Square is" + sq);

        System.out.println("Enter the cost of Pen");
        float d = scanner.nextFloat();
        System.out.println("Enter the cost of Pencil");
        float e = scanner.nextFloat();
        System.out.println("Enter the cost of Eraser");
        float f = scanner.nextFloat();
        float bill = d + e + f * 18 / 100;
        System.out.println("Toal bill is " + bill + "$");
        scanner.close();

        int $ = 23; // Names of variables are called identifiers in Java. Identifier rule says,identifiers can start with any alphabet or underscore (“_”) or dollar (“$”)
        System.out.println($); // Example initialization for 'result'
    }
}
