public class BinaryCoefficent {
    public static int Factorial(int n){
        int Factorial = 1;
     for (int i = 1; i <= n; i++) {
        Factorial*=i;
    }
    // System.out.println(Factorial);
    return Factorial;
    }
    public static int Binary(int n, int r){
        int f = Factorial(n);
        int g = Factorial(r);
        int c = Factorial(n-r);
        int d = f/(g*c);
        System.out.println(d);
        return d;
    }
    public static void main(String[] args) {
        Binary(5, 2);
    }
}
