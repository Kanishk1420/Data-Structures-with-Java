public class ArraySorted {
    public static boolean normal(int arr[]){
    for (int i = 0; i < arr.length-1; i++) {
    if (arr[i]>arr[i+1]) {
    return false;
    }
    }
    return true;
    }
    public static boolean Recursion(int arr[], int i){
    if(i==arr.length-1)
    return true;
    if(arr[i]>arr[i+1])
    return false;
    return Recursion(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
       System.out.println(normal(arr));
       System.out.println(Recursion(arr,0));
    }
}
