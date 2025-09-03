public class ReversewordStringII {
   public static  String reverseWords(String s) {
    StringBuilder sb = new StringBuilder("");
    String[] st = s.split(" ");
    for (int i = st.length-1; i>= 0; i--) {
        sb.append(st[i]);
        if(i>0)
        sb.append(" ");
    }
    
    return sb.reverse().toString();
}
public static void main(String[] args) {
    String s = "Leetcoding nerd";
    System.out.println(reverseWords(s));
}
}
