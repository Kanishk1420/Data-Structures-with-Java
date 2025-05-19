public class LargestArray {
    public static int largest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        System.out.println("The largest number is "+largest);
        return largest;
    }
    public static int smallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (smallest>numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest number is "+smallest);
        return smallest;
    }
    public static void main(String args[]){
     int numbers[] = {1,2,6,3,5};
     largest(numbers);
     smallest(numbers);
    }
}
