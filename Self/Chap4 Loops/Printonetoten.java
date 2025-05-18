import java.util.Scanner;

public class Printonetoten {
    public static void main(String[] args) {
        int counter = 1;
        int newcounter = 1;
        int n;
        int sum = 0;
        int newsum = 0;
        while (counter<=10) {
            System.out.print(counter+" ");
            sum = sum+counter;
            counter++;
        }
        System.out.println("\n");
        System.out.println("Sum is "+sum);
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        while (newcounter<=n) {
        System.out.print(newcounter+" ");
        newsum=newsum+newcounter;
        newcounter++;
    }
    System.out.println("\n");
    System.out.println("The sum is "+newsum);
        sc.close();
    }
}
