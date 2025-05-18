public class NumberIncreasing {
    public static void Number(int n){
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j+" ");
        }
        System.out.println();
    }
    }
    public static void Reverse(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Number(4);
        Reverse(4);
    }
}
