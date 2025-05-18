package Practice;

import java.util.Scanner;

public class Factoial {
    public static void main(String[] args) {
        int k = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            k*=i;
        }
        System.out.println(k);
        sc.close();
    }
}
