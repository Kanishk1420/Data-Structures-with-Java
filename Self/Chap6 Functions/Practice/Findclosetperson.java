public class Findclosetperson {
    public static int findClosest(int x, int y, int z) {
        int t = Math.abs(y-z);
        int u = Math.abs(x-z);
        if(t>u)
        return 2;
        if(t<u)
        return 1;
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(findClosest(2, 5, 6));
        System.out.println(findClosest(1, 5, 3));
        System.out.println(findClosest(2, 7, 4));
    }
}
