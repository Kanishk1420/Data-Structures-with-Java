public class Prime {
    public static void prime(int n) {
        for (int i = 0; i <= n; i++) {
            boolean isTrue = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isTrue = true;
                    break;
                }
            }
            if (isTrue == true) {
                System.out.println("Number is not Prime " + i);
            } else {
                System.out.println("Number is Prime " + i);
            }
        }
    }

    public static void main(String[] args) {
        prime(100);
    }
}
