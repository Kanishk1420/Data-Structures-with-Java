import java.util.*;;
public class Inbuilt {
     public static int[] sortArray(int[] nums) {
        Arrays.sort(nums,0,3);
        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {5,2,3,1};
        int [] sortArray = sortArray(nums);
    System.out.println(Arrays.toString(sortArray));
    }
}
