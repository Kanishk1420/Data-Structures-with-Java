// 1.Aim of the program -Write a program to print your name, roll no, section and branch in separate lines.
// Input:   Mention Name,Roll no,Section and branch
// Output:  Display Name
// Display Roll No
// Display Section
// Display Branch
import java.util.Scanner;
class Main{
    String name;
    int rollno;
    int Section;
    String Branch;
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      Scanner r = new Scanner(System.in);
      System.out.println("Enter your Name:-");
      String name = in.nextLine();
      System.out.println("Name:-" +name);
      System.out.println("Enter your Rollno:-");
      int rollno = r.nextInt();
      System.out.println("Rollno:-"+rollno);
      System.out.println("Enter your Section:-");
      int Section = in.nextInt();
      System.out.println("Section:-"+Section);
      System.out.println("Enter your Branch:-");
      String Branch = in.nextLine();
      System.out.println("Branch:-" +Branch);

    }
}
// 2. Aim of the program:  Write a program to print the corresponding grade for the given mark using if..else statement in Java
// Input:  Mention the grade in the program
// Output: Display the Grade either O/E/A/B/C
// Aim of the program:  Write a program to print the corresponding grade for the given mark using if..else statement in Java
// Input:  Mention the grade in the program
// Output: Display the Grade either O/E/A/B/C
import java.util.Scanner;
class test{
   int grade;
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.println("Enter your Grade");
      int grade = in.nextInt();
      if (grade>=90) {
         System.out.println("Your grade is O:-" +grade);
      }
      else if (grade<90 && grade>=80) {
         System.out.println("Your grade is E:-" +grade);
      } 
      else if (grade<80 && grade>=70) {
         System.out.println("Your grade is A:-" +grade);
      }
      else if (grade<70 && grade>=60) {
         System.out.println("Your grade is B:-" +grade);
      }
      else if (grade<60 && grade>=50) {
         System.out.println("Your grade is C:-" +grade);
      }
      else {
         System.out.println("You are Fail:-" +grade);
      }
   
   }
}
// 3.Aim of the program:   Write a program to print the week day for the given day no. of the current month using switch case statement
// Input:  Mention the Day no in the program
// Output: Display the week day(either Sunday/Monday/Tuesday/Wednesday /Thursday/Friday/Saturday)
import java.util.Scanner;
class test{
   int day;
   public static void main(String[] args) {
      System.out.println("March 2024");
      System.out.println("Enter the day of week you want");
      Scanner in = new Scanner(System.in);
      int day = in.nextInt();
      System.out.println("The day is:-"+day);
      switch (day) {
         case 4,11,18,25: 
         System.out.println("Monday");
         break;
         case 5,12,19,26:
         System.out.println("Tuesday");
         break;
         case 6,13,20,27:
         System.out.println("Wednesday");
         break;
         case 7,14,21,28:
         System.out.println("Thursday");
         break;
         case 8,15,22,29:
         System.out.println("Friday");
         break;
         case 9,16,23,30:
         System.out.println("Saturday");
         break;
         case 3,10,17,24,31:
         System.out.println("Sunday");
         break;
         default:
         System.out.println("Invalid day");
         break;
      }
   }
}
// 4. Aim of the program : Program to check a user entered number is palindrome or not 
// Input:  Mention the number in the program
// Output: display the number is Palindrome or not.

import java.util.Scanner;
class test{
   int n;
   int r; //remainder
   int reversed;
   int original;
   public static void main(String[] args) {
      System.out.println("Enter the number:");
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      System.out.println(n);
      int original = n;
      int reversed = 0;
      while (n != 0) {
        int r = n % 10;
         reversed =  reversed * 10 + r;
        n /=  10;
      }
      if (original==reversed) {
       System.out.println("The number is palindrome" +original);
      }
      else{
    System.out.println("The number is not palindrome" +original);
      }
}
}
// 5. Aim of the program :  Write a program in Java to take first name and last name from user and print both in one line as last name followed by first name
// Input:  Enter first name: KIIT
// Enter Second Name: UNIVERSITY
// Output:  UNIVERSITY KIIT
import java.util.Scanner;
class test{
   String str1;
   String str2; 
   
   public static void main(String[] args) {
      System.out.println("Enter the String-");
      Scanner in = new Scanner(System.in);
      String str1  = in.nextLine();
      System.out.println("Enter the String-");
      String str2 = in.nextLine();
      System.out.println(str2+""+str1);
   }
}
// 6. Aim of the program :  Find the largest among 3 user entered nos. at the command prompt using Java
// Input: Enter three number.
// Output: Display the Largest Number
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("The largest number is " + largest);
    }
}
// output:- javac java.test
// java .test 
// 12 13 14
// 14 is highest

// 7. Aim of the program : Accept 10 numbers from starting 0 to 10 and check how many of them are even and how many are odd.
// Output:  Display number of even and odd number
public class test {
    int n;
    public static void main(String[] args) {
       for (int i = 0; i <= 10; i++) {
          int n = i;
          if (n % 2 == 0) {
             System.out.println("Your number is even" + n);
          } else {
             System.out.println("Your number is odd" + n);
          }
       }
    }
 }
//  <---------------------------------------------------------------------------------------------->