package Practice;

public class Digitsum {
    public static void sum(int n){
        int sum = 0;
        while (n!=0) {
            int remainder = n % 10;
            sum = sum + remainder;
            n = n/10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sum(13344);
    }
}
