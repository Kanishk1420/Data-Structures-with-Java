public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        String s4 = new String("Tony");
        if (s1==s2) {
            System.err.println("String is equal");
        }
        else {
            System.err.println("String is not equal");
        }
        if (s2==s3) {
            System.err.println("String is equal");
        }
        else {
            System.err.println("String is not equal");
            // Why s3 and s1 are not equal   because new keyword will create new string value.
        }
        if (s3.equals(s4)) {
            System.err.println("String is equal");
        }
        else {
            System.err.println("String is not equal");
        }
    }   
}
