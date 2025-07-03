public class Xorofsubsets {
    // Returns XOR of all XOR's of given subset
    public static int findXOR(int Set[], int n) {

        // XOR is 1 only when n is 1, else 0
        if (n == 1)
            return Set[0];
        else
            return 0;
    }
    public static int binarycode(int n){
        int number = 0b1010;
        return number;
    }
    public static void main(String arg[]) {
        int Set[] = { 1, 2, 3 };
        int n = Set.length;
        System.out.print("XOR of XOR's of all subsets is "
                + findXOR(Set, n));
        System.err.println("\n");
        System.out.println(binarycode(n));
    }
}
