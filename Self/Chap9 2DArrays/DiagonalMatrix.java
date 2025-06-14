public class DiagonalMatrix {
    public static void diagonal(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // pd & sd
                if (i==j || i+j == matrix.length-1) {
                    System.err.print(matrix[i][j] + " ");
                    sum = sum+matrix[i][j];
                }
            }
            System.err.println();
        }
        System.err.println("Diagonal sum of matrix is "+sum);
    }
public static int optimizedsum(int matrix[][]){
    int sum = 0;
    //pd
    for (int i = 0; i < matrix.length; i++) {
         sum+= matrix[i][i];
         // sd
         if (i!=matrix.length-1-i) 
             sum+= matrix[i][matrix.length-1-i];
            }
            return sum;
}
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        diagonal(matrix);
        System.err.println("Diagonal sum of matrix is "+optimizedsum(matrix));
    }
}
