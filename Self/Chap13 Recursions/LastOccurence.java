public class LastOccurence {
    public static int lastOccurence(int arr[],int index,int i){
    if(i==0)
    return -1;
    if(arr[i]==index){
        return i;
    }
    return lastOccurence(arr, index,i-1);
    }
    public static void main(String[] args) {
        int arr[] = {8,5,5,3,4,5};
        System.out.println(lastOccurence(arr, 5, arr.length-1));
    }
}
