public class Countingsort {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int arr[] = {1,8,2,3,1,2,8};
        for (int i = 1; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        // occurence
        int count[] = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;       
        }
        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i]+" ");
        }
    }
}
