public class Subarrays {
    public static void subarrays(int n[]) {
        int tsp = 0;
        int sum = 0;
        
        // Initialize min to the largest possible value and max to the smallest
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < n.length; i++) {
            for (int j = i+1; j <= n.length; j++) {
                sum = 0; 
                for (int k = i; k < j; k++) {
                    System.err.print(n[k] + " ");
                    sum += n[k]; // Accumulate the sum
                }
                
                // Update min and max after calculating each subarray sum
                minSum = Math.min(minSum, sum);
                maxSum = Math.max(maxSum, sum);
                
                tsp++;
                System.out.println();
                System.out.println("Total sum of Subarray is " + sum);
            }
        }
        
        System.out.println("Minimum subarray sum: " + minSum);
        System.out.println("Maximum subarray sum: " + maxSum);
        System.out.println("Total number of subarrays: " + tsp);
    }
    public static void main(String[] args) {
        int n[] = {2,4,6,8,10};
        subarrays(n);
    }
}
