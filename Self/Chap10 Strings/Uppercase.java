public class Uppercase {
    public static String toUppercase(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            
            // Handle words less than 3 characters
            if (word.length() < 3) {
                sb.append(word.toLowerCase());
            } 
            // Handle words with 3 or more characters
            else {
                sb.append(Character.toUpperCase(word.charAt(0)));
                sb.append(word.substring(1).toLowerCase());
            }
            
            // Add space after each word except the last one
            if (i < words.length - 1) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "First leTTeR of EACH Word";
        System.err.println(toUppercase(str));
    }
}