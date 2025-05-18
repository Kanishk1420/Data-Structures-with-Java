public class BinarytoDecimal {
    public static void Binary(int n){
     int mynumber = n;
     int pow = 0;
     int dec = 0;
     while (n != 0) {
        int lastDigit = n % 10;
        dec = dec + (lastDigit * (int)Math.pow(2, pow));
        pow++;
        n = n/10;
     }
     System.out.println("decimal of "+ mynumber +" = "+dec);
    
    }
        public static void Decimal(int n){
            int mynumber = n;
            int pow = 0;
            int binary = 0;
            while (n!=0) {
                int remainder = n % 2; 
                binary = binary + remainder * (int)Math.pow(10, pow);
                pow++;
                n=n/2;
            }
            System.out.println("binary of "+ mynumber+" = "+binary);
        }
    public static void main(String[] args) {
        Binary(101);
        Decimal(10);
    }
}