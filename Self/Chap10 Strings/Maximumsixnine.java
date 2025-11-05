public class Maximumsixnine {
     public static int maximum69Number (int num) {
        // converting number to string then convert it into char array
          char s[] = String.valueOf(num).toCharArray();
          for (int i = 0; i < s.length; i++) {
              if(s[i]=='6'){
                s[i]='9';
                break;
              }
          }
        return Integer.parseInt(new String(s)); // converting char[] to String then parse into number.
    }
    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
    }
}
