public class FirstOccurence {
    public static int finding(int arr[], int index){
    for (int i = 0; i < arr.length; i++) {
    if(arr[i]==index)
    return i;
    }
    return 0;
    }
    public static int recursivefinding(int arr[], int index, int i){
    if(i==arr.length)
    return -1;
    if(arr[i]==index){
        return i;
    }
    return recursivefinding(arr, index,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,6,12};
        System.out.println(finding(arr,6));
        System.out.println(recursivefinding(arr, 6, 0));
    }
}
