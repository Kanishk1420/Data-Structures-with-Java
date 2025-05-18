public class Reverse {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) { // outer loop how many times you want to print the star
         for (int j = 4; j >= i; j--) {
            System.out.print(" * "); // inner loop how many times you want to print you want reverse the stars given in copy 
         }   
         System.out.println();
        }
    }
}
