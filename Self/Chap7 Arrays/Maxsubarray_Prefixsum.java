public class Maxsubarray_Prefixsum {
    public static void prefix(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        
        // Calculate prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
            System.out.println(prefix[i]);
        }

        // Calculate max subarray sum using prefix array
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                // Sum of subarray arr[i...j]
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                
                // Update maximum sum found so far
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println("Maximum subarray sum is: " + maxSum); 
    }
    
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        prefix(arr);
    }
}
// Time complexity is 0(n2);