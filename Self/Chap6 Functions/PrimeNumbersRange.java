public class PrimeNumbersRange {
    public static void Prime(int n) {
        for (int i = 0; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == false) {
                System.err.println("Not Prime Numbers " +i);
            } else {
                System.out.println("Prime Numbers " +i);
            }
        }
    }

    public static void main(String[] args) {
        Prime(50);
    }
}
