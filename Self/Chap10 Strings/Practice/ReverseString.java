class ReverseString {
    public static void reverseString(char[] s) {
       StringBuilder sb = new StringBuilder("");
       String str = new String(s);
      String compress = sb.append(str).reverse().toString();
      for (int i = 0; i < compress.length(); i++) {
        s[i] = compress.charAt(i);
      }
    }
    public static void optimizedreversestring(char[]s){
       int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            // Swap characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        char s[] = {'h','e','l','l','o'};
        reverseString(s);
        optimizedreversestring(s);
    }
}