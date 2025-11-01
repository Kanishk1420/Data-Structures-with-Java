import java.util.Arrays;

public class Plusone {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Iterate from right to left
        for(int i = n-1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // Set to 0 and continue (carry over)
        }
        
        // If we reach here, all digits were 9
        int[] newNumber = new int[n+1];
        newNumber[0] = 1;
        return newNumber;
    }
    
    public static void main(String[] args) {
        // Test Case 1: Simple increment
        int[] test1 = {1, 2, 3};
        System.out.println("Test 1: " + Arrays.toString(test1) + " + 1 = " + 
        Arrays.toString(plusOne(test1)));
        
        // Test Case 2: Single digit 9
        int[] test2 = {9};
        System.out.println("Test 2: " + Arrays.toString(test2) + " + 1 = " + 
        Arrays.toString(plusOne(test2)));
        
        // Test Case 3: Multiple 9s at the end
        int[] test3 = {8, 9, 9};
        System.out.println("Test 3: " + Arrays.toString(test3) + " + 1 = " + 
        Arrays.toString(plusOne(test3)));
        
        // Test Case 4: All 9s
        int[] test4 = {9, 9, 9};
        System.out.println("Test 4: " + Arrays.toString(test4) + " + 1 = " + 
        Arrays.toString(plusOne(test4)));
        
        // Test Case 5: No carry needed
        int[] test5 = {4, 3, 2, 1};
        System.out.println("Test 5: " + Arrays.toString(test5) + " + 1 = " + 
        Arrays.toString(plusOne(test5)));
        
        // Test Case 6: Carry in middle
        int[] test6 = {1, 9, 9};
        System.out.println("Test 6: " + Arrays.toString(test6) + " + 1 = " + 
        Arrays.toString(plusOne(test6)));
    }
}
