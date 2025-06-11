import java.util.Scanner;
// Creating matrix by user and searching element 
public class Creation {
   public static boolean search(int arr[][],int key){
    for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[0].length; j++) {
        if (arr[i][j]==key) {
            System.err.print("Found at cell ("+i+","+j+")");
            return true;
        }
    }
    System.err.println("");
   }
   System.out.println("Key not found");
   return false;
   }
   public static int smallest(int arr[][]){
   int smallest = Integer.MAX_VALUE;
   for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[0].length; j++) {
        smallest =  Math.min(smallest, arr[i][j]);
    }
   }
   return smallest;
   }
   public static void main(String[] args) {
   int arr[][] = new int[3][3];
   Scanner sc = new Scanner(System.in);
    System.err.println("Enter the number ");
   for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[0].length; j++) {
      arr[i][j] = sc.nextInt();
    }
   }
   System.err.println("The matrix:- ");
    for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[0].length; j++) {
      System.err.print(arr[i][j]+" ");
    }
    System.err.println("");
   }
   sc.close();
   search(arr, 3);
   System.err.println("Smallest element in the array is "+smallest(arr));  
   }
}

