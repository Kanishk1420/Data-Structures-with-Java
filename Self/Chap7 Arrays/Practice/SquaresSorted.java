import java.util.Arrays;
public class SquaresSorted {
    public static int[] sortedSquares(int[] nums) {
        int[] ar = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ar[i] = nums[i]*nums[i];
        }
        Arrays.sort(ar);
      return ar;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }
}
