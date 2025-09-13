import java.util.Arrays;

public class Twosum {
public static int[] twoSum(int[] nums, int target) {
    for(int i=0; i<nums.length; i++){
        for(int j=i+1; j<nums.length; j++){
            if(nums[i]+nums[j]==target){
            return new int[] { i, j };
            }
        }
    }
    return new int[]{};
    }
    public static void main(String[] args) {
        int nums[] = {2,3,4,6,7};
        int[] result = twoSum(nums, 9);
        System.out.println(Arrays.toString(result));
    }
}

