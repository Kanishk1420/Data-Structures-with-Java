public class PalindroneTriangle {
    public static void printPalindromeTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Triangluar(int n){
   for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n-i; j++) {
       System.out.print(" "); 
    }
    for (int j = 1; j <= i; j++) {
        System.out.print(j);
    }
    for (int j = i-1; j >= 1; j--) {
        System.out.print(j);
    }
    System.out.println();
   }
    }
    
    public static void main(String[] args) {
        printPalindromeTriangle(4);
        Triangluar(4);
    }
}
