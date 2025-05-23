class PostitiveNegative {
    public static int maximumCount(int[] nums) {
       int pos = 0;
       int neg = 0;
       for (int i = 0; i < nums.length; i++) {
         if (nums[i]>0) {
            pos++;
         }
         if(nums[i]<0){
            neg++;
         }
      }
      return Math.max(pos, neg);
    }
    public static void main(String[] args) {
      int nums[]={-2,-1,-1,1,2,3};
      System.out.println(maximumCount(nums));
    }
}