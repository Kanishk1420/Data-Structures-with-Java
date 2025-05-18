public class HollowHourglass {
    public static void hourglass(int n){
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i-1; j++) {
            System.out.print(" ");
        }
        for (int j = n; j >= i; j--) {
            if(i==1||j==1||i==j||j==n){
                System.out.print(" *");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    for (int i = n-1; i >= 1 ; i--) {
        for (int j = 1; j <= i-1; j++) {
            System.out.print(" ");
        }
        for (int j = n; j >= i; j--) {
            if(i==1||j==1||i==j||j==n){
                System.out.print(" *");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        hourglass(6);
    }
}
