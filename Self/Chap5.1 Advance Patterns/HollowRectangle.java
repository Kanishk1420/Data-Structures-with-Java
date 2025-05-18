public class HollowRectangle {
    public static void Hollow(int rows, int columns){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1|| i == rows ||j == 1|| j==columns) {
                    System.err.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
       Hollow(4, 5);
    }
}