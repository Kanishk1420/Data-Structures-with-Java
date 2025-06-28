public class Reversearray {
    public static void reverse(int arr[], int k) {
        for (int i = 0; i < arr.length; i=i+k) {
          int end = i + k - 1;
            if (end >= arr.length) {
                end = arr.length - 1;
            }
            
            // Reverse print the current group
            for (int j = end; j >= i; j--) {
                System.err.println(arr[j]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8};
        reverse(arr, 3);
    }
}
