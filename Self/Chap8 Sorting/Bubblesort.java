public class Bubblesort {
    public static void bubbleSort(int[] arr) {
        boolean swap;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            swap = false;
            for (int j = 0; j <= arr.length - 2 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        bubbleSort(arr);
    }
}
// Time complexity is o(n2)