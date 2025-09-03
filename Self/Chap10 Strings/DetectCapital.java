public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        String capWord = word.toUpperCase();
        String smallWord = word.toLowerCase();
        String oneCap = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();

        if (word.equals(capWord))
            return true;
        else if (word.equals(smallWord))
            return true;
        else if (word.equals(oneCap))
            return true;

        return false;
    }

    public static void main(String[] args) {
        String word = "Leetcode";
        System.err.println(detectCapitalUse(word));
    }

}
