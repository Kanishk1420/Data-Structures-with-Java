public class Break {
    // Break Statement is used to break the statement in btw the code
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i==3) {
                System.out.println("Stop"+i);
                break;
            }
        }
    }
}
