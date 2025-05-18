import java.util.Scanner;

public class Calculator {
    public static void mul(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the numbers you want to print");
       int n = sc.nextInt();
       int product = 1;
       for (int i = 1; i <= n; i++) {
        System.out.println("Enter number " + i + ":");
        int num = sc.nextInt();
        product*=num;
    }
    System.out.println("Product is"+ product);
    }
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers you want to print");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter number"+i+":");
            int num = sc.nextInt();
            sum+=num;
        }
        System.out.println(sum);
    }
    public static void sub(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers you want to print");
        int n = sc.nextInt();
        int sub = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter number"+i+":");
            int num = sc.nextInt();
            sub-=num;
        }
        System.out.println(sub);

    }
    
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter Operations Btw M,A,S");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the operation you want to do");
            String in = sc.nextLine();
            if (in.equals("M")|| in.equals("m")) 
            mul();
            else if (in.equals("A")||in.equals("a"))
            sum();
            else if(in.equals("S")|| in.equals("s"))
            sub();
            else {
                System.out.println("Invalid");
            }     
        }
    }
}
