public class ReversewordString {
    public static  String reverseWords(String s) {
    StringBuilder sb = new StringBuilder("");
    String[] st = s.trim().split("\\s+");
    for (int i = st.length-1; i>= 0; i--) {
        sb.append(st[i]+" ");
    }
    
    return sb.toString();
}
public static void main(String[] args) {
    String s = "the sky is blue";
    System.err.println(reverseWords(s));
}
}
