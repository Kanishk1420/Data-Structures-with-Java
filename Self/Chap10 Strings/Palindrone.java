public class Palindrone {
    public static boolean stringpalindrone(String str){
    // Preprocess: remove non-alphanumeric chars and convert to lowercase
    String processed = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    for (int i = 0; i < processed.length()/2; i++) {
        if (processed.charAt(i) != processed.charAt(processed.length()-i-1)) {
            System.err.println("Not Palindrone");
              return false;
        }
    }
    System.err.println("Palindrone");
    return true;
    }
    public static void main(String[] args) {
       System.err.println(stringpalindrone("A man, a plan, a canal: Panama"));
    }
}
// Time complexity:- O(N)