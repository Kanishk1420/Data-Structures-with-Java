public class Shortest {
    public static int Path(String s) {
        int x = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 's') {
                y--;
            } else if (s.charAt(i) == 'n') {
                y++;
            } else if (s.charAt(i) == 'w') {
                x--;
            } else if(s.charAt(i) == 'i') {
                x++;
            }
        }
        return (int)Math.sqrt(x*x + y*y);
    }

    public static void main(String[] args) {
        System.err.println(Path("NS"));

    }
}
