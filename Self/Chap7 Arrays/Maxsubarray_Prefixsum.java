public class Maxsubarray_Prefixsum {
public static int prefix(int arr[]){
int prefix[] = new int[arr.length];
int maxSum = Integer.MIN_VALUE;
int currentsum = 0;
prefix[0] = arr[0];
for(int i=1; i<arr.length; i++){
 prefix[i] = prefix[i-1]+arr[i];
}
for(int i = 0; i<arr.length; i++){
  currentsum = 0;
  for(int j = i; j<arr.length; j++){
  if(i == 0){
    currentsum = prefix[j];
  }
    else{
      currentsum = prefix[j] - prefix[i-1];
    }
    maxSum = Math.max(currentsum, maxSum);
  }
}
return maxSum;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        System.out.println("Maximum Subarray sum by using prefix sum method is "+prefix(arr));
    }
}
// Time complexity is 0(n2);