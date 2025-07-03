public class Xorofoneton {
    public static int oneton(int n){
    int mask = 0;
    for (int i = 1; i < n+1; i++) {
     mask = mask^i;
    }
    return mask;
    }
    public static void main(String[] args) {
    System.err.println(oneton(5));    
    }
}
