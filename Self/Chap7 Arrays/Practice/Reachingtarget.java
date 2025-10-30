// Question:- Increaments the array element to reach target element and count how many steps.
import java.util.Arrays;

class Reachingtarget {
    public static int minNumberOperations(int[] target) {
        int arr[] = new int[target.length];
        int count = 0;
        // Keep looping until arrays are equal
        while (!Arrays.equals(arr, target)) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] != target[i]){
                    arr[i]++;
                }
            }
            // Print current statz
            System.out.println(Arrays.toString(arr));
            count++;
        }
        System.out.println("Final: " + Arrays.toString(arr));
        return count;
    }
    
    public static void main(String[] args) {
        int target[] = {3,1,1,2};
        System.out.println("Number of Steps "+minNumberOperations(target));
    }
}
