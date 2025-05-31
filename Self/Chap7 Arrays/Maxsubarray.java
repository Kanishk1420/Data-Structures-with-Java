public class Maxsubarray {
public static void subarray(int n[]){
int maxSum = Integer.MIN_VALUE;
int minSum = Integer.MAX_VALUE;
int sum = 0;
 for (int i = 0; i <= n.length; i++) {
     for (int j = i+1; j <= n.length; j++) {
         sum = 0;
         for (int k = i; k < j; k++) {
             System.out.print(n[k]+" ");
             sum += n[k];
            }
            System.out.println("");
        maxSum = Math.max(maxSum, sum);
        minSum = Math.min(minSum, sum);

        System.out.println("Total sum is "+sum);
    }
     System.out.println("");
    System.out.println("Maximum sum is "+maxSum);
    System.out.println("Minimum sum is "+minSum);
 }
}
    public static void main(String[] args) {
        int n[] = {-2,1,-3,4,-1,2,1,-5,4};
        subarray(n);
    }
}
// Time complexity is o(n3)