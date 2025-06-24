public class Pyrmaid {
    public static void pyramid(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void spacepyramid(int n){
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                counter++;
                System.out.print(counter+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // pyramid(5);
        spacepyramid(4);
    }
}
