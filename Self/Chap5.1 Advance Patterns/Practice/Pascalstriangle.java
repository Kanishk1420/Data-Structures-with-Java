public class Pascalstriangle {
    public static void pascal(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            int x = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(x+" ");
                x = x * (i - j) / j;
            }
            System.out.println();
        }
    }
    public static void rightpascal(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pascal(4);
        rightpascal(3);
    }
}
