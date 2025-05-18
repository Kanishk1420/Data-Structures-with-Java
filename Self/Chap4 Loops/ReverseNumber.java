public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1089;
        int digit ;
        while (n!=0) {
            digit = n % 10; // Extract the last digit
            n = n / 10; // Remove the last digit
            System.out.print("The reverse number is "+digit);
        }
    }
}
