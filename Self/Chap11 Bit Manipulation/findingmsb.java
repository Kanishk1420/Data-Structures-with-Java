public class findingmsb {
    // Native approach to find MSB position (0-based), or -1 if n == 0
    public static int findMSB(int n) {
        if (n == 0) return -1;
        int pos = 0;
        while (n > 1) {
            n = n >> 1;
            pos++;
        }
        return pos;
    }
    // Native approach to find LSB position (0-based), or -1 if n == 0
    public static int findLSB(int n) {
        if (n == 0) return -1;
        int pos = 0;
        while ((n & 1) == 0) {
            n = n >> 1;
            pos++;
        }
        return pos;
    }

    public static void main(String[] args) {
        int msb = findMSB(10);
        int lsb = findLSB(10);
        System.err.println("MSB position: " + msb);
        System.err.println("LSB position: " + lsb);
    }
}
