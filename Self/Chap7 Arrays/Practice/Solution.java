public class Solution {
    public static int maxProduct(int[] n) {
        
        // Initialize result to first element
        int result = n[0];
        
        // Two variables to track max and min products
        int max = n[0];
        int min = n[0];
        
        // Process rest of array
        for (int i = 1; i < n.length; i++) {
            // If current element is negative, swap max and min
            // (because multiplying by negative flips the values)
            if (n[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            
            // Update max and min
            max = Math.max(n[i], max * n[i]);
            min = Math.min(n[i], min * n[i]);
            
            // Update result
            result = Math.max(result, max);
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        int[] test1 = {2, 3, -2, 4};       // Expected: 6
        int[] test2 = {-2, 0, -1};         // Expected: 0
        int[] test3 = {-2, -3, -1};        // Expected: 6
        
        System.out.println("Test 1: " + maxProduct(test1));
        System.out.println("Test 2: " + maxProduct(test2));
        System.out.println("Test 3: " + maxProduct(test3));
    }
}