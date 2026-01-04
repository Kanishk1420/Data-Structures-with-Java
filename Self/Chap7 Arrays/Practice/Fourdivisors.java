// Brute force 
public class Fourdivisors {
    public static int sumFourDivisors(int[] nums) {
        int count = 0;
        int divisor = 0;
        int totalsum = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            divisor = 0;
            for (int j = 1; j <= nums[i]; j++) {
                if (nums[i] % j == 0) {
                    count+= j;
                    divisor++;
                }
            }
            if (divisor == 4)
                totalsum += count;
        }
        return totalsum;
    }
    public static int optimizedsumFourDivisors(int[] nums){
        int count = 0;
        int divisor = 0;
        int totalsum = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            divisor = 0;
            for (int j = 1; j*j <= nums[i]; j++) {
                if (nums[i] % j == 0) {
                    count+= j;
                    divisor++;
                    if (j * j != nums[i]) {
                        count += nums[i] / j;
                        divisor++;
                    }
                }
            }
            if (divisor == 4)
                totalsum+=count;
        }
        return totalsum;
    }
    
    public static void main(String[] args) {
        int nums[] = { 21, 4, 7 };
        System.err.println(sumFourDivisors(nums));
    }
}
