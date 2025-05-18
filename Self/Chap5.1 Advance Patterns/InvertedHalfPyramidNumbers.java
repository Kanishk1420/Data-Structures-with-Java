public class InvertedHalfPyramidNumbers {
    public static void pyramid(int n){
    for (int i = 0; i < n; i++) {
        for (int j = 1; j <= n-i; j++) {
            System.out.print(j);
        }
        System.err.println();
    }
    }
    public static void main(String[] args) {
       pyramid(5); 
    }
}
