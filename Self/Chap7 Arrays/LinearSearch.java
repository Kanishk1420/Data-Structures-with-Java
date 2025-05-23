public class LinearSearch {
    public static int linear(int numbers[], int key){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == key){
                System.out.println("The number " + key + " found at index " + i);
                return i; // Return the index where key was found
            }
        }
        // If we get here, the key wasn't found in the array
        System.out.println("The key " + key + " was not found in the array");
        return -1; // Return -1 to indicate key not found
    }
    public static int linea(int numbers[], int key){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==key) {
                return i;
            }
        }
       return -1; 
    }
    
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14,16,18};
        linear(numbers, 13);

        int linea = linea(numbers, 14);
        if (linea == -1) {
            System.out.println("Not found");
        }
        else{
            System.out.println("Key Found at "+linea);
        }
    }
}
// time complexity is O(n)