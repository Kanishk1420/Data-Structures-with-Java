public class count {
    public static int countZeroBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static  double myPow(double x, int n){
          return Math.pow(x,n);
    }

    public static void main(String[] args) {
        System.err.println(countZeroBits(10));
        System.err.println(myPow(2.00, 10));
    }
}
