public class Consecutive {
    public static int cosecutive(int n[]) {
        int maxcount = 0;
        int count = 1;
        for (int i = 1; i < n.length; i++) {
            if (n[i] == n[i - 1]) {
                count++;
            } else {
                maxcount = Math.max(maxcount, count);
                count = 1;
            }
        }
        return Math.max(maxcount, count);
    }

    public static int findMaxConsecutiveOnes(int[] n) {
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            count1 = Math.max(count1, count);
        }
        return count1;
    }

    public static void main(String[] args) {
        int n[] = { 0, 1, 0, 0, 0, 0, 0, 0 };
        System.err.println(cosecutive(n));
        System.err.println(findMaxConsecutiveOnes(n));
    }
}
