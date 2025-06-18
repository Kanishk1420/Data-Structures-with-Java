public class Sorting {
    public static void bubblesort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.err.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 0, 5, 6, 4, 7, 9, 3, 2, 1, 0, 6 };
        bubblesort(arr);
    }
}
