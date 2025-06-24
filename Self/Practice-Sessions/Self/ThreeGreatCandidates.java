import java.util.Arrays;
import java.util.Collections;

public class ThreeGreatCandidates {
    public static int max(Integer n[]) {
        Arrays.sort(n, Collections.reverseOrder());
        return n[0]*n[1]*n[2];
    }

    public static int optimal(int k[]) {
        Arrays.sort(k);
           int n = k.length;
         int option1 = k[n-1] * k[n-2] * k[n-3];
        
        // Option 2: Product of largest element and two most negative elements
        // (negative × negative × positive can yield a larger result)
        int option2 = k[n-1] * k[0] * k[1];
        
        return Math.max(option1, option2);
    }

    public static void main(String[] args) {
        Integer n[] = { 10, 3, 5, 6, 20 };
        int k[] = { 852 ,-566 ,182 ,-638, -693, -323};
        System.err.println(max(n));
        System.err.println(optimal(k));
    }
}
