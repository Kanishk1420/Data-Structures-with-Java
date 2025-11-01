import java.util.Arrays;

class Digitville {    
    public int[] getSneakyNumbers(int[] nums) {
        int arr[] = new int[2];
        int count = 0;
        Arrays.sort(nums);    
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                arr[count++] = nums[i];
            }
        }
        return arr;
    }
        public static void main(String[] args) {
        Digitville solution = new Digitville();
        
        // Test case 1
        int[] nums1 = {0, 1, 1, 0};
        System.out.println("Test 1: " + Arrays.toString(solution.getSneakyNumbers(nums1)));
        
        // Test case 2
        int[] nums2 = {0, 3, 2, 1, 3, 2};
        System.out.println("Test 2: " + Arrays.toString(solution.getSneakyNumbers(nums2)));
        
        // Test case 3
        int[] nums3 = {7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2};
        System.out.println("Test 3: " + Arrays.toString(solution.getSneakyNumbers(nums3)));
    }
}