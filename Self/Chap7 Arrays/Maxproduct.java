// This only works for 122 testcases out of 190 still good for interviews incase it asked
public class Maxproduct {
    public static int subarray(int arr[]){
        int cs = 1;
        int ms = Integer.MIN_VALUE;
        int negative = arr[0];
        for(int i=0; i<arr.length; i++){
          if(negative ==0){
          cs = 1;
        }
            cs = cs*arr[i];
            ms = Math.max(cs,ms);
        }
    return ms;
}

public static void main(String[] args){
   int arr[] = {0,2,6};
   System.out.println(subarray(arr));
   }
}
