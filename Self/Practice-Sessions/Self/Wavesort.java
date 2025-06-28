public class Wavesort {
    public static void wave(int arr[]){
    for (int i = 0; i < arr.length-1; i++) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
    }
    for (int i = 0; i < arr.length; i++) {
        System.err.println(arr[i]);
    }
    }
    public static void plusone(int arr[]){
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number*10+arr[i];
        }
        System.err.println(number+1);
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4};
        wave(arr);
        plusone(arr);
    }
}
