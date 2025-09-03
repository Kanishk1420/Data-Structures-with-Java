public class LargestOddNumber {
    public static String largestOddNumber(String num) {
        // Check from the end (rightmost) going left
        for (int i = num.length() - 1; i >= 0; i--) {
            char digit = num.charAt(i);
            // Check if this digit is odd
            if ((digit - '0') % 2 != 0) {
                // Return substring from beginning to this odd digit
                return num.substring(0, i + 1);
            }
        }
        return ""; // No odd digit found
    }

    public static void main(String[] args) {
        String num = "5326";
        System.out.println(largestOddNumber(num)); // Output: "5"
    }
}
