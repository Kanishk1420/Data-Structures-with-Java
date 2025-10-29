public class RepeatedSubstring {
    public static boolean repeatedSubstringPattern(String s) {
    String concant = s+s;
    System.err.println(concant);
    System.out.println(concant.substring(1,concant.length()-1));
    System.out.println(s);
    return concant.substring(1,concant.length()-1).contains(s);
    }
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));
    }
}
