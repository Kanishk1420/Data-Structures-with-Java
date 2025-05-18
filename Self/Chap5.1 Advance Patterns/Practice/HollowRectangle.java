public class HollowRectangle {
    public static void Hollow(int r, int c){
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i==1||j==1||r==i||c==j) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hollow(6, 5);
    }
}