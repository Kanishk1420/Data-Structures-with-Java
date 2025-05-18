import java.util.Scanner;
public class Incometax {
    public static void main(String[] args) {
        // income < 5L-   0%tax
        // income between 5-10L - 20%tax
        // income > 10L- 30%tax

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income");
        int income = sc.nextInt();
        if (income<=500000) {
            System.out.println("0% tax: "+income*0.0);
        }
        else if(income>500000 && income<=1000000){
            System.out.println("20% tax "+income*0.2);
        }
        else if(income>1000000){
            System.out.println("30% tax "+income*0.3);
        }
        sc.close();
    }
}
