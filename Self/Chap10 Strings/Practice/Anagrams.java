import java.util.Arrays;

public class Anagrams {
    public static boolean anagrams(String s, String t) {
       if(s.length()!=t.length())
        return false;
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        for(int i=0; i<char1.length; i++){
        if(char1.length==char2.length && char1[i]!=char2[i])
        return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "rat";
        String str1 = "cac";
        System.err.println(anagrams(str, str1));
    }
}


// Arrays.equals() compares two arrays element by element
// Returns true if both arrays have:
// 1. Same length (already checked earlier)
// 2. Same elements in the same order

// Example walkthrough with "rat" and "tar":
// After sorting: char1 = ['a','r','t'], char2 = ['a','r','t']
// Arrays.equals compares: 'a'=='a', 'r'=='r', 't'=='t'
// All match, so returns true (they are anagrams)

// Example with "rat" and "car":
// After sorting: char1 = ['a','r','t'], char2 = ['a','c','r']
// Arrays.equals compares: 'a'=='a', 'r'=='c' (false!)
// Returns false (not anagrams)