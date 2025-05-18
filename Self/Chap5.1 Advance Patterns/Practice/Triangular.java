public class Triangular {
    public static void triangular(int n){
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n-i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print(" *");
        }
        System.out.println();
      }  
    }
    public static void Reversenumber(int n){
        for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= i-1; j++) {
            System.out.print(" ");
        }
            for (int j = i; j <= n; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
             for (int j = 1; j <= i-1; j++) {
            System.out.print(" ");
        }
            for (int j = i; j <= n; j++) {
                System.out.print(j+ " ");
            }
            System.out.println(); 
        }
    }
    public static void main(String args[]){
        // triangular(5);
        Reversenumber(4);
    }
}
