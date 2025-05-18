public class Palindrone {
    public static void palin(int n){
        int original = n;
        int reverse = 0;
        int sum = 0;
     while (n!=0) {
        int remainder = n % 10;
        reverse = reverse*10+remainder;
        sum = sum+remainder;
        n = n/10; 
     }
     System.out.println(sum);
     if (original==reverse) {
        System.out.println("Number is Palindrone");
     }
     else{
        System.out.println("Number is not Palidrone");
     }
     
    }
    public static void main(String[] args) {
        palin(-121);
    }
}
