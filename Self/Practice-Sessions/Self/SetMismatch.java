public class SetMismatch {
    
    public static int[] findErrorNums(int[] nums) {
    int n = nums.length;
    int ans[] = new int[2];
    long sum = 0;
     for(int i = 0; i<nums.length; i++){
         for (int j = i+1; j < nums.length; j++) {
             if (nums[i]==nums[j]) {
                 ans[0] = nums[i];
                }
            }
            sum += nums[i];
}
long expSum = n * (n + 1)/2;
ans[1] = (int)(expSum - sum+ans[0]);
return ans;
    }
    
    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {1, 2, 2, 4};
        System.out.println("Input: nums = [1,2,2,4]");
        int[] result1 = findErrorNums(nums1);
        System.out.print("Output: [");
        System.out.print(result1[0] + ", " + result1[1]);
        System.out.println("]");
        System.out.println("Expected: [2, 3] (2 is duplicate, 3 is missing)\n");
        
        // Test case 2
        int[] nums2 = {1, 1};
        System.out.println("Input: nums = [1,1]");
        int[] result2 = findErrorNums(nums2);
        System.out.print("Output: [");
        System.out.print(result2[0] + ", " + result2[1]);
        System.out.println("]");
        System.out.println("Expected: [1, 2] (1 is duplicate, 2 is missing)\n");
        
        // Test case 3
        int[] nums3 = {3, 2, 3, 4, 6, 5};
        System.out.println("Input: nums = [3,2,3,4,6,5]");
        int[] result3 = findErrorNums(nums3);
        System.out.print("Output: [");
        System.out.print(result3[0] + ", " + result3[1]);
        System.out.println("]");
        System.out.println("Expected: [3, 1] (3 is duplicate, 1 is missing)");
    }
}
