public class Maxsubarray_Kadane {
    public static int kadane(int n[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int largest = n[0];
        for (int i = 0; i < n.length; i++) {
            largest = Math.max(largest, n[i]);
        }
        for (int i = 0; i < n.length; i++) {
            cs = cs+n[i];
            if (cs<0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        if (largest<0) {
            return largest;
        }
        return ms;
    }
    public static void main(String[] args) {
        int n[] = {-1,-2,-3,-4};
        System.out.println("The maximum subarray of array is "+kadane(n));
    }
}
// Time complexity is 0(n2)