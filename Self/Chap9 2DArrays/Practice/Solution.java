import java.util.*;
class Solution {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[i-1])
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,4,6};
        System.out.println(containsDuplicate(nums));
    }
}