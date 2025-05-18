import java.util.Scanner;

/**
 * Comments :- 
 * This program demonstrates a simple Java application that calculates 
 * the sum of two integers and prints the result to the console. from input and user also
 */
class Sum {
  public static void main(String[] args) {
    // int a = 12;
    // int b = 23;
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = a+b;
    System.out.println("Sum of Addition "+c);
    sc.close();
  }
}
