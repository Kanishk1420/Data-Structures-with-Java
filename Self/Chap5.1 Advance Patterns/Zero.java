public class Zero {
    public static void zero(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2==0) {
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
         zero(5);
    }
}
