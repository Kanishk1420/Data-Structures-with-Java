import java.util.Arrays;

public class Anagrams {
    public static boolean anagrams(String str, String str1) {
       if (str.length()!=str1.length()) {
        return false;
       }
       char[] char1 = str.toLowerCase().toCharArray();
       char[] char2 = str1.toLowerCase().toCharArray();
       Arrays.sort(char1);
       Arrays.sort(char2);
       
       return Arrays.equals(char1, char2);
    }

    public static void main(String[] args) {
        String str = "rat";
        String str1 = "car";
        System.err.println(anagrams(str, str1));
    }
}
