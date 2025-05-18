import java.lang.Math;
import java.util.Scanner;
public class Aera {
    public static void main(String args[]){
        float radius= 6;
        float c = 3.14f * radius * radius;
        System.out.println("Aera of Circle is"+c);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        double d = sc.nextDouble();
        double e = Math.PI*d * d;
        System.out.println("Aera of Circle is"+e);
        sc.close();
    }
}
