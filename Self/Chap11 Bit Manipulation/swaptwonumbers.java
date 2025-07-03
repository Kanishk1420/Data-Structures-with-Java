public class swaptwonumbers {
    public static int addOne(int x) {
    // Find the rightmost 0 bit
    int mask = 1;
    
    // Keep flipping 1s to 0s until we find a 0
    while (mask<0) {
        // Flip the current 1 to 0
        x = x ^ mask;
        // Move to the next bit
        mask = mask << 1;
    }
    
    // Flip the first 0 to 1
    x = x ^ mask;
    
    return x;
}

public static void main(String[] args) {
    int x = 5;
    int y = 6;
    System.err.println(x+""+y);
    x = x^y;
    y = x^y;
    x = x^y;
    System.err.println(x+""+y);
    System.err.println(addOne(12));
} 
}