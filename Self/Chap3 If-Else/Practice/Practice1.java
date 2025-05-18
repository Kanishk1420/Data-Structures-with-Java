package Practice;
import java.util.Scanner;

public class Practice1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<0) {
            System.out.println("Negative");
        }
        else if(a>0){
            System.out.println("Postive");
        }
        else {
            System.out.println("Neutral");
        }
        sc.close();
        }
}
