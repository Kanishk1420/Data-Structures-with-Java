import java.util.Scanner;
public class PrimeNumbers {
    public static int Prime(){
        while (true) {
            boolean isPrime = false;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int n = sc.nextInt();
            for (int i = 2; i <= Math.sqrt(n) && i<= n-1; i++) {  // we can use one of them but sqrt is more optimized one approach
                if (n % i == 0) {
                    isPrime = true;
                }
                
            }
            if (isPrime == true) {
                System.err.println("Not Prime Numbers");
            }
            else{
                System.out.println("Prime Numbers");
            }
        }
    }
    public static void main(String[] args) {
        Prime();
    }
}
