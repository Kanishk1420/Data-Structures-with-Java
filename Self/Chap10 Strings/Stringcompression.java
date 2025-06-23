public class Stringcompression {
    public static String builder(String str){
        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i < str.length(); i++) {
            str.charAt(i);
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                i++;
                count++;
            }
            sb.append(str.charAt(i));
            if (count>1) {
             sb.append(count.toString());   
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String newcomp = " ";
        String comp = "aaaabb";
        for (int i = 0; i < comp.length(); i++) {
            comp.charAt(i);
            Integer count = 1;
            while (i<comp.length()-1 && comp.charAt(i) == comp.charAt(i+1)) {
                i++;
                count++;
            }
            newcomp += comp.charAt(i);
            if (count>1) {
                newcomp += count.toString();
            }
        }
        System.err.println(newcomp);
        System.err.println(builder("aaaabbcc"));
    }
}
