public class HollowRectangle {
    public static void Hollow(int r,int c){
    for (int i = 1; i <= r; i++) {
        for (int j = 1; j <= c; j++) {
            if (i==1||j==1||i==r||j==c) {
               System.err.print("*"); 
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        Hollow(5, 4);
    }
}
