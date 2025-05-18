package Practice;

public class Palindrone {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            System.out.println(false);
            return false;
        }
    int reverse = 0;
    int original = x;
    boolean r = true;
    while (x!=0) {
        int remainder = x % 10;
        reverse = reverse * 10 + remainder;
        x = x / 10; 
    }
    if (original == reverse) {
        System.out.println(r);
        return true;
    }
    else{
        r = false;
        System.out.println(r);
        return false;
    }
    }
    public static void main(String[] args) {
   isPalindrome(-121);
   } 
}
