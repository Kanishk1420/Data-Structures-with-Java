public class Powerofn {
    public static double myPow(double x, int n){
        if (n == 0) {
            return 1;
        }
        // Handle negative exponent
        if (n < 0) {
            x = 1 / x;
            n = -n;   // x^-n == 1/x^n
        } 
        return x * myPow(x, n - 1);
    }
    
    public static double optimizedpower(double x, int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            x = 1 / x;
            n = -n;
        }
        double half = optimizedpower(x, n / 2);
        double halfpowersq = half * half;
        if (n % 2 != 0) {
            halfpowersq = x * halfpowersq;
        }
        return halfpowersq;
    }
    
    public static void main(String[] args) {
        System.out.println(myPow(2.0000, 10));   // 1024.0
        System.out.println(myPow(2.0000, -2));   // 0.25
        System.out.println(optimizedpower(2.0000, -2)); // 0.25
    }
}
