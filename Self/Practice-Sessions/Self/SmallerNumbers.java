public class SmallerNumbers {
    
    public static int[] smallerNumbersThanCurrent(int[] nums) {
    int ans[] = new int[nums.length];
    int count = 0;
    for(int i= 0; i<nums.length; i++){
        count = 0;
        for(int j=0; j<nums.length; j++){
            if(nums[i]>nums[j]){
              count++;
              ans[i] = count;
            }
        }
    }
    return ans;
    }
    
    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {8, 1, 2, 2, 3};
        System.out.println("Input: nums = [8,1,2,2,3]");
        int[] result1 = smallerNumbersThanCurrent(nums1);
        System.out.print("Output: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Expected: [4, 0, 1, 1, 3]\n");
        
        // Test case 2
        int[] nums2 = {6, 5, 4, 8};
        System.out.println("Input: nums = [6,5,4,8]");
        int[] result2 = smallerNumbersThanCurrent(nums2);
        System.out.print("Output: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Expected: [2, 1, 0, 3]\n");
        
        // Test case 3
        int[] nums3 = {7, 7, 7, 7};
        System.out.println("Input: nums = [7,7,7,7]");
        int[] result3 = smallerNumbersThanCurrent(nums3);
        System.out.print("Output: ");
        for (int num : result3) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Expected: [0, 0, 0, 0]");
    }
}
