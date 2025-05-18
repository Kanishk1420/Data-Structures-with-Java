public class HollowTriangle {
    public static void triangular(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j==1||j==i||i==n||i==1) {
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
public static void ReverseTriangle(int n){
    for (int i = n; i >= 1; i--) {
        for (int j = 1; j <= n-i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            if (j==1||i==j||i==n) {
                System.out.print(" *");
            }
            else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
public static void Hollowdiamond(int n){
    for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j==1||j==i||i==1) {
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
     for (int i = n-1; i >= 1; i--) {
        for (int j = 1; j <= n-i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            if (j==1||i==j||i==1){
                System.out.print(" *");
            }
            else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }    
}
    public static void main(String[] args) {
        triangular(5);
        ReverseTriangle(5);
        Hollowdiamond(6);
    }
}
