public class SortedSearch {
    public static void searching(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.err.println("Found at cell (" + i + "," + j + ")");
                    break;
                }
                else{
                    System.err.println("Key not found (" + i + "," + j + ")");
                }
            }
        }
    }

    public static boolean rowbinarysearching(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[0].length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;

                if (matrix[i][mid] == key) {
                    System.err.println("Found at cell (" + i + "," + mid + ")");
                    return true;
                } else if (matrix[i][mid] < key) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return false;
    }

    public static boolean columnbinarysearching(int matrix[][], int key) {
        for (int i = 0; i < matrix[0].length; i++) {
            int start = 0;
            int end = matrix[0].length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (matrix[i][mid] == key) {
                    System.err.println("Found at cell (" + i + "," + mid + ")");
                    return true;
                }
                if (matrix[i][mid] < key) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }

    public static boolean staircase(int matrix[][], int key) {
        int row = 0;
        int column = matrix[0].length - 1;
        while (row <= matrix.length && column >= 0) {
            if (matrix[row][column] == key) {
                System.err.println("Found at cell (" + row + "," + column + ")");
                return true;
            } else if (key < matrix[row][column]) {
                column--;
            } else {
                row++;
            }
        }
        System.err.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        searching(matrix, 30);
        System.err.println(rowbinarysearching(matrix, 3));
        System.err.println(columnbinarysearching(matrix, 23));
        staircase(matrix, 30);
    }
}
