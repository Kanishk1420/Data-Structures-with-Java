public class Reverse {
    public static void reverse(int n){
        int reverse = 0;
        while (n!=0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n/10;
        }
        System.out.println("Reverse Number is"+ reverse);
    }
    public static void main(String[] args) {
        reverse(1234);
    }
}
