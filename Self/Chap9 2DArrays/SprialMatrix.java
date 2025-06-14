public class SprialMatrix {
    public static void sprialMatrix(int matrix[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;
        while (startcol <= endcol && startrow <= endrow) {
            // top
            for (int j = startcol; j <= endcol; j++) {
                System.err.println(matrix[startrow][j] + " ");
            }
            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.err.println(matrix[i][endcol] + " ");
            }
            // bottom
            for (int j = endcol - 1; j>= startcol; j--) {
                if (startrow == endrow) {
                    break;
                }
                System.err.println(matrix[endrow][j] + " ");
            }
            // left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.err.println(matrix[i][startcol] + " ");
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 } };
        sprialMatrix(matrix);
    }
}
