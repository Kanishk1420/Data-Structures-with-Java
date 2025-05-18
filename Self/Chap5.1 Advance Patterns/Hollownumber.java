public class Hollownumber {
    public static void number(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                    if (i == 1 || j == 1 || columns == j || rows == i) {
                        System.err.print(j);
                    } 
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
        number(5, 5);
    }
}
