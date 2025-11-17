public class Shuffle {
    
    public static int[] shuffle(int[] nums, int n) {
      int ans[] = new int[nums.length];
      for(int i=0; i<n; i++){
        ans[2*i] = nums[i];  //1st entry in array
        ans[2*i+1] = nums[i+n]; // alternate switching to 2nd
      }  
      return ans;
    }
    
    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {2, 5, 1, 3, 4, 7};
        int n1 = 3;
        System.out.println("Input: nums = [2,5,1,3,4,7], n = 3");
        int[] result1 = shuffle(nums1, n1);
        System.out.print("Output: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        
        // Test case 2
        int[] nums2 = {1, 2, 3, 4, 4, 3, 2, 1};
        int n2 = 4;
        System.out.println("Input: nums = [1,2,3,4,4,3,2,1], n = 4");
        int[] result2 = shuffle(nums2, n2);
        System.out.print("Output: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        
        // Test case 3
        int[] nums3 = {1, 1, 2, 2};
        int n3 = 2;
        System.out.println("Input: nums = [1,1,2,2], n = 2");
        int[] result3 = shuffle(nums3, n3);
        System.out.print("Output: ");
        for (int num : result3) {
            System.out.print(num + " ");
        }
    }
}
