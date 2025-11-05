public class StringtoInteger {
    public static int myAtoi(String s){
    s = s.trim();
    StringBuilder sb = new StringBuilder("");
    for (int i = 0; i < s.length(); i++) {
    if (s.charAt(i)>='0'&& s.charAt(i)<='9')
    sb.append(s.charAt(i));
    }
    return Integer.parseInt(sb.toString());
}
    public static void main(String[] args) {
    System.out.println(myAtoi("342cf6"));
    }
}
