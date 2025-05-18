public class DecimaltoBinary {
    public static void Decimal(int n){
        // int quotient;
        int remainder;
        int pow = 0;
        int binary = 0;
        while (n!=0) {
            remainder = n%2;
            binary = binary + remainder * (int)Math.pow(10, pow);
            pow++;
            n=n/2;
        }
        System.out.println(binary);
    }
    public static void main(String[] args) {
        Decimal(15);
    }
}
