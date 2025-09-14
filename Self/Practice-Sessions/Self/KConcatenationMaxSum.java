// This problem can only pass 37 testcases in leetcode out of 44 but because of not overcomplexity of the problem i will only use this
public class KConcatenationMaxSum {
    public static int kConcatenationMaxSum(int[] arr, int k) {
        int[] result = new int[arr.length * k];
        int index = 0;
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int largest = arr[0];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < arr.length; j++) {
                result[index++] = arr[j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            largest = Math.max(largest, result[i]);
        }
        for (int i = 0; i < result.length; i++) {
            cs = cs + result[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        return ms;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2 };
        System.out.println(kConcatenationMaxSum(arr, 3));
    }
}
