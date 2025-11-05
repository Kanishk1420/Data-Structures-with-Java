public class RotateMatrix {
 public static void rotate(int[][] matrix){
 // The problem is that you're creating a new array result but the LeetCode problem expects you to modify the original matrix in-place.
 // So we are doing transponse matrix without creating new array and optimized appraoch
 for (int i = 0; i < matrix.length; i++) {
    for (int j = i+1; j < matrix.length; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
 }
 // Reverse every row of the transpse matrix  
        for (int i = 0; i < matrix.length ; i++) {
            int left = 0;
            int right = matrix.length - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("After");
        for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
 }
 public static void main(String[] args) {
    int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
    System.out.println("Before");
    for (int i = 0; i < matrix.length; i++) {
     for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j]+" ");
     }
     System.out.println();
    }
    rotate(matrix);
 }   
}
