import java.util.Scanner;
// user input String by user 
// converts into lowercase
// count how many vowels are there.
public class Lowercasevowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the String");
        String str = sc.nextLine();
        System.err.println(str.toLowerCase());
        int count = 0;
        for (int i = 0; i < str.toLowerCase().length(); i++) {
            count = 0;
            if (str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'e'
                    || str.toLowerCase().charAt(i) == 'i' || str.toLowerCase().charAt(i) == 'o'
                    || str.toLowerCase().charAt(i) == 'u') {
                count++;
            }
        }
        System.err.println("No of vowels are there is " + count);
        sc.close();
        String str1 = "Kanishk";
        String str2 = "The great";
        String str3 = "Kanishk";
        System.out.println(str1.equals(str2) +" "+str1.equals(str3));
        String str4="ApnaCollege".replace("l","");
        System.err.println(str4);
    }
}