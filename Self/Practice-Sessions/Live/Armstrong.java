public class Armstrong {
   public static boolean armstrong(int n){
    int number = n;
    int sum = 0;
    boolean check = false;
    while (n!=0) {
    double remainder = n % 10;
    remainder = Math.pow(remainder, 3);
    sum+=remainder;
    n=n/10;
    }
    if (sum == number) {
        check = true;
    }
    return check;
   }

   public static void main(String[] args) {
   System.err.println(armstrong(123));
   }
}
