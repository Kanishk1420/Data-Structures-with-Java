public class Fibonnaci {
    public static void fibonnaciloop(int n) {
        int n1 = 0;
        int n2 = 1;
        for (int i = 0; i < n; i++) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n1 + " ");
        }
    }

    public static int Fibonnacirecursion(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        n = Fibonnacirecursion(n - 1) + Fibonnacirecursion(n - 2);
        return n;
    }

    public static void main(String[] args) {
        int n = 10;
        fibonnaciloop(n);
        System.out.println("Fibonacci Calculated by Recursion "+Fibonnacirecursion(10));
    }
}
