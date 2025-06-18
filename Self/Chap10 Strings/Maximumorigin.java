public class Maximumorigin {
    public static int furthestDistanceFromOrigin(String moves) {
         int x= 0;
         int y = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i)=='L') {
                x--;
            }
            else if (moves.charAt(i)=='R') {
                x++;
            }
            else if (moves.charAt(i)=='_') {
              y++;
            }
        }
        return (int)Math.sqrt(x*x)+y;
    }
    public static void main(String[] args) {
    System.err.println(furthestDistanceFromOrigin("R_"));
    }
}
