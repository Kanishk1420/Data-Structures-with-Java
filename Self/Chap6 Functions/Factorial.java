// Print Factorial and increase the factorial by +1
public class Factorial {
    public static int factorial(int n){
    int fac = 1;
    for (int i = 1; i<=n ; i++) {
        fac*=i;
    }
    System.out.println(fac);
    return 1;
    }
    public static void main(String[] args) {
        int c = 10;
        int n = 1;
        for (int i = 1; i <= c; i++) {
            factorial(n);
            n++;
        }
    }
}
