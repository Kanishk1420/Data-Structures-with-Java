public class poweroftwo {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        } else if ((n & (n - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPowerOfThree(int n) {
        if (n <= 0)
            return false;
        else if (n == 1)
            return true;
        else if (n > 1)
            return n % 3 == 0 && isPowerOfThree(n / 3);
        // this is recurssion concept which will deal later
        else
            return false;
    }

    public static boolean isPowerOfFour(int n) {
        if (n <= 0)
            return false;
        else if (n == 1)
            return true;
        else if (n > 1)
            return n % 4 == 0 && isPowerOfFour(n / 4);
        // this is recurssion concept which will deal later
        else
            return false;
    }

    public static boolean isPowerOfFours(int n) {
        if (n <= 0 || (n & (n - 1)) != 0) {
            return false;
        }
        if (n % 3 == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfThree(9));
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFours(16));
    }
}
