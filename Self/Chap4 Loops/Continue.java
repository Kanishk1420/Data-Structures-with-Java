public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                continue;
            } // we are skipping 3 here
            System.out.println(i);
        }
    }
}
