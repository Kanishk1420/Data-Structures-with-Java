public class CharacterPattern {
    public static void main(String[] args) {
        char asc = 'A';
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(asc);
                asc++;
            }
            System.out.println();
        }
    }
}
