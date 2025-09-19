public class Wordbreaker {
    public static String isValid(String word) {
        boolean inside = false;
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '[') {
               sb.append(word.charAt(i));
                inside = true;
            }
            else if ( inside && word.charAt(i) == ']') {
                sb.append(word.charAt(i));
                inside = false;
            }
            else if(inside){
                sb.append(word.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word = "My main [word] is [comma]";
        System.out.println(isValid(word));
    }
}
