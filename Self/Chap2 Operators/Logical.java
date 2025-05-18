public class Logical {
    public static void main(String[] args) {
        int c = 23;
        int d = 10;
        System.out.println((c>d) && (c==d));
        System.out.println((c<d) || (c>=d));
        System.out.println(!(c<d) && (c>=d));
    }
}
