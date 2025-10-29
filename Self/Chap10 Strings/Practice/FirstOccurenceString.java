public class FirstOccurenceString {
    public static int strStr(String haystack, String needle) {
     if(haystack.contains(needle)) 
     return haystack.indexOf(needle);
     return -1; 
    }
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));  
}
}
// .equals() → checks if strings are identical
// .contains() → checks if one string contains another
// .indexOf() → returns the position where substring starts (or -1 if not found)