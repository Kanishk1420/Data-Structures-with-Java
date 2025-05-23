public class ReverseArray {
    public static void array(int arr[]){
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void arry(int arr[]){
        int first = 0;
        int last = arr.length-1;
        while (first<last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first=first+1;
            last=last-1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        // array(arr);
        arry(arr);
    }
}
// Time complexity is o(n)