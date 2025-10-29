public class Smallestnumber {
    public static void main(String[] args) {
    int n = 5;
    // in this problem we need to find the Return the smallest number x greater than or equal to n, such that the binary representation of x contains only set bits ( contians all 1 as example as 7-> 111)
    // to find this Numbers with all bits set to 1 are exactly the numbers where n & (n + 1) == 0. This happens because when you add 1 to such a number, it becomes a clean power of two with a single 1 bit.
    /* Analysis:
    Binary of 5: 101 (not all ones)
    Check 5: 5 & 6 = 101 & 110 = 100 ≠ 0 → continue
    Check 6: 6 & 7 = 110 & 111 = 110 ≠ 0 → continue
    Check 7: 7 & 8 = 0111 & 1000 = 0000 = 0 ✓
    Answer: 7 */

    while((n & (n + 1)) != 0) {
    n++;
    }
    System.out.println(n);
    }
}
