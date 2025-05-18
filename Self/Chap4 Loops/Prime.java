import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number");
            double n = sc.nextDouble();
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) { // we can take n-1 here but taking underoot n because of lesser time complexity than n-1 for bigger values 
                if (n % i ==0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("is prime ");
            }
            else {
                System.out.println("is not prime");
            }
        }
    }
}
