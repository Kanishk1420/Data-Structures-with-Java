import java.util.Scanner;

public class Accessmodifier {
    public static void main(String[] args) {
    BankAccount p1 = new BankAccount();
    p1.username = "Clash of Clans";
    System.out.println(p1.username);
    p1.setpassword("");
    p1.otp = 1234;
    }
}
class BankAccount{
 public String username;
 private String password;
 protected int otp;
 public void setpassword(String pwd){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the password");
     pwd = sc.nextLine();
    StringBuilder masked = new StringBuilder();
    for(int i = 0; i < pwd.length(); i++) {
        masked.append("*");
    }
    password = masked.toString();
    System.out.println(password);
    sc.close();
 }
}
