public class BinarySearch {
    public static int binarySearch(int arr[], int key){
    int start = 0;
    int end = arr.length-1;
    while (start<=end) {
        int mid = (start+end)/2;
        if (arr[mid]==key) {
            return mid;
        }
        if(arr[mid]>key){
            end = mid-1;
            
        }
        if(arr[mid]<key){
            start = mid+1;
            
        }
    }
    return -1;
}
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        System.out.println("The key for index is:"+ binarySearch(arr, 10 ));
    }
}
// Time complexity is o(log n);