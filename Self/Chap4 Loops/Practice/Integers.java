package Practice;

public class Integers {
    // Question 2:Write a program that reads a set of integers, and then prints the sum of the even and odd integers 
    public static void main(String[] args) {
        int sum = 0;
        int sumy = 0;
        System.out.println("Even and Odd Numbers from -10 to 20:\n");
        for (int i = -10; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
                sum += i;
            } else {
                System.out.println("Odd:  " + i);
                sumy += i;
            }
        }
        System.out.println("\n-----------------------------");
        System.out.println("Sum of Even Numbers: " + sum);
        System.out.println("Sum of Odd Numbers:  " + sumy);
    }
}
