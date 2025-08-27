import java.util.Scanner;

public class BasicCreation {
    public static void main(String args[]){
        // creation
    int matrix[][] = new int[3][3];
    Scanner sc = new Scanner(System.in);
    // input
    for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[0].length; j++) {
     matrix[i][j] = sc.nextInt();   
    }
}
// output
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j]+" ");
    }    
    System.err.println();
}
sc.close();
}
}
