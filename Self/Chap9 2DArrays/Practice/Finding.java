public class Finding {
    public static int searching(int array[][], int key) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (key == array[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }
    public static int sum(int array[][]){
        int count = 0;
        for (int i = 1; i < array.length-1; i++) {
            for (int j = 0; j < array[0].length; j++) {
                count=count+array[i][j];
            }
        }
        return count;
    }
    public static void transpose(int arr[][]){
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < result.length; i++) {
        for (int j = 0; j < result[0].length; j++) {
            System.out.print(result[i][j] + " ");
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        int array[][] = { {1,4,9},{11,4,3},{2,2,3}};
        System.err.println(searching(array, 7));
        System.err.println(sum(array));
        int arr[][] = {{1,2,3},{4,5,6}};
        transpose(arr);
    }
}