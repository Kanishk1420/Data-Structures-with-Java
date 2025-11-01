public class LengthofLastWord {
    public static int lengthOfLastWord(String s) {
    String[] arr = s.split(" "); // ["Hello","World"]
    return arr[arr.length-1].length();
    }
    public static void main(String[] args){
    System.out.println(lengthOfLastWord("Hello World"));   
    }
}
