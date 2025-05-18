public class OptBinaryCoefficient {
    public static int factorial(int n){
        int fac = 1;
        for (int i = 1; i<=n ; i++) {
            fac*=i;
        }
        // System.out.println(fac);
        return fac;
        }
        public static int BinaryCoff(int n, int r){
            int factn = factorial(n);
            int factr = factorial(r);
            int factnr = factorial(n-r);
            int BinaryCoeff = factn/ (factr*factnr);
            return BinaryCoeff;
        }
    public static void main(String[] args) {
        System.out.println(BinaryCoff(5, 2));
    }
}
