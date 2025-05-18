public class BinaryCoefficent {
    // nCr = n!/r!*(n-r)!
    public static void binomal(int n, int r){
        int fac = 1;
        int facc = 1;
        int faccc =1;
        if (r<=n) {
            for (int i = 1; i <= n; i++) {
              fac*=i;
            }
            // System.out.println(fac);  
            for (int i = 1; i <= r; i++) {
                facc*=i;
            }
            // System.out.println(facc);
            for (int i = 1; i <= n-r; i++) {
                faccc*=i;
            }
            // System.err.println(faccc);
            int f = facc*faccc;
            int d = fac/f;
            System.out.println(d);
        }
        else {
            System.out.println("Invalid Results");
        }
    }
 public static void main(String[] args) {
    binomal(5, 2);
 }

}
