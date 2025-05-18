public class Bintodectobin {
    public static void BintoDec(int n){
      int decimal = 0;
      int pow = 0;
      while (n!=0) {
        int lastdigit = n % 10;
        decimal = decimal + lastdigit * (int)Math.pow(2, pow);
        pow++;
        n=n/10;
      }
      System.out.println("Binary to Decimal is "+decimal);
    }
    public static void DectoBin(int n){
    int digit = 0;
    int pow = 0;
    while (n!=0) {
        int remainder = n % 2;
        digit = digit + remainder * (int)Math.pow(10, pow);
        pow++;
        n=n/2;
    }
    System.out.println("Decimal to Binary is"+digit);
    }
    public static void main(String[] args) {
        BintoDec(101);
        DectoBin(5);
    }
}
