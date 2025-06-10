public class Selectionsort {
public static void selection(int arr[]){
    boolean swap = false;
    for (int i = 0; i < arr.length-2; i++) {
        int minpostion = i;
        for (int j = i+1; j < arr.length; j++) {
            if (arr[minpostion]>arr[j]) {
                minpostion = j;
                System.out.println(arr[minpostion]+""+arr[i]);
            }
        }
        int temp = arr[minpostion];
        arr[minpostion] = arr[i];
        arr[i] = temp;
        swap = true;
        if (!swap) {
            break;
        }
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]+" ");
    }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        selection(arr);
    }
}
// time complexity is o(n2)