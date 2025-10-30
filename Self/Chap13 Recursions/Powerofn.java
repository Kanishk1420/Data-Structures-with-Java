public class Powerofn {
    public static double myPow(double x , int n){
    if (n==0) {
    return 1;
    }
    return x*myPow(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(myPow(2.0000, 10));
    }
}
