// Find the quadrant of the point in the graph;

import java.util.Scanner;

public class Quadrant {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.println("Enter the X coordinate");
        int x = sc.nextInt();
        System.out.println("Enter the Y coordinate");
        int y = sc.nextInt();
        if (x>0 && y>0) {
            System.out.println("Quadarant 1");
        }
        else  if (x<0 && y>0) {
            System.out.println("Qudarant 2");
        }
        else if (x<0 && y<0) {
            System.out.println("Quadarant 3");
        }
        else if (x>0 && y<0) {
            System.out.println("Quadarant 4");
        }
        else {
            System.out.println("Not lie");
        }
    }
 }
    
}