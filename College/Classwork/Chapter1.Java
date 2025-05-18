            // JAVA OBJECT ORIENTED PROGRAMMING //

/*Java is a programming language and a platform.
Java is a high level, robust, secured and object-oriented
programming language.

**High-Level Programming Language: Java is considered a high-level programming language because it abstracts away many of the complex details of the machine (computer hardware) such as memory management,
*A high level of syntax which is easier to read and understand for humans. High-level languages are closer to human languages and further from machine languages.

**Robust Language: Java is known as a robust language because it provides a strong mechanism for error checking and exception handling. 
*It has strong memory management, does not support pointers for memory, has automatic garbage collection, and features like exception handling and type checking mechanisms, all of which make Java robust.

**Object-Oriented Programming Language: Java is an object-oriented programming language, which means it uses a programming paradigm that is centered around objects rather than functions.

The key principles of object-oriented programming in Java are encapsulation, inheritance, and polymorphism */

/*                           TYPES OF JAVA APPLICATIONS
There are mainly 4 types of applications that can be created using java programming.
1-Standalone Application
2-Web Application
3-Enterprise Application
4-Mobile Application    
                             JAVA VERSIONS/EDITIONS
1. Java SE (Java Standard Edition):- It is a java programming platform. It includes Java programming
APIs(application programming interface) such as java.lang, java.io,
java.net, java.util, java.sql, java.math etc. It includes core topics
like OOPs, String, Regex, Exception, Inner classes, Multithreading,
I/O Stream, Networking, AWT, Swing, Reflection, Collection etc.

2- Java EE (Java Enterprise Edition):- It is an enterprise platform which is mainly used to develop web and  enterprise applications.
3- Java ME (java Micro Edition) :- It is a micro platform which is mainly used to develop mobile applications.
4- Java Fx  :- It is used to develop rich internet applications.

                                FEATURES OF JAVA
Basic concepts of OOPs are:
Object
Class
Inheritance
Polymorphism
Abstraction
Encapsulation
// Java Application RUNES IN JVM With uses its own runtime environment. meanwhile c++ uses its run time environment in whole os.
Architecture-neutral

Java is architecture neutral because there is no implementation
dependent features e.g. size of primitive types is fixed.

In C programming, int data type occupies 2 bytes of memory for
32-bit architecture and 4 bytes of memory for 64-bit architecture.
But in java, it occupies 4 bytes of memory for both 32 and 64 bit
architectures.*/
public class Simple
{
public static void main(String args[])
{
System.out.println("hello world");
}
}
/*class keyword is used to declare a class in java.

public keyword is an access modifier which represents
visibility, it means it is visible to all.

static is a keyword, if we declare any method as static, it
is known as static method.

void is the return type of the method, it means it doesn't
return any value.

main represents the starting point of the program.

String[] args is used for command line argument.

System.out.println() is used print statement.

                                Difference between JDK, JRE and JVM
JDK:- JAVA DEVELOPMENT KIT its used to develop java applications it contains JRE and JVM(JRE+JVM)
JRE:- JAVA RUNTIME ENVIRONMENT It contains set of libraries + other files that JVM uses at runtime.
JVM :- JAVA VIRTUAL MACHINE its a virtual machine which didnt usually physically exist its an abstract machine.JVMs are available for many hardware and software platforms.JVM, JRE and JDK are platform dependent because configuration
of each OS are different from each other.
The JVM performs following main tasks:
Loads code
Verifies code
Executes code
Provides runtime environment*/
//q1)//
class commandlineargument{
    public static void main(String[] args){
        System.out.println("Your first Argument is" + args[0]);
    }
}
/* input:- javac test.java
 * input:- java test Amit
 * output:- Your first Argument is Amit
 test.java is file name & test is class name javac is used to comppile the code */
 //q2//
class test{
    public static void main(String[] args){
      int a = 10;
      System.out.println("The value of a is " +a);
    }
}
//q3//
class test{
    public static void main(String[] args){
      for(int i = 0; i<args.length; i++){
      System.out.println("The value of i is " +args[i]);
    }
}
}
// Command line Argument 
// 1.Using Buffered Reader Class:
/*import java.io.BufferedReader; where java.io. is loading pacakge of bufferedReader,IoException& InputstreamReader
import java.io.IOException;    
import java.io.InputStreamReader;*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    // reader is object name and new bufferedreader(new inputstreamReader(system.in) is syntax)
    String name = reader.readLine();
    // reader line is string function that will pass to reader and then pass to string name. which will then print next in System.out.println(name); 
    System.out.println(name);
  }
}
// q2 show the addition by using BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class test{
  int a,b;
  public static void main(String args[])throws IOException{
  BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
  // java is case sensitive lanaguage as you cant write bufferedreader you need to write as BufferedReader
  int a = Integer.parseInt(Reader.readLine());
  System.out.println("the value of a is "+a);
  int b = Integer.parseInt(Reader.readLine());
  System.out.println("the value of a is "+b);
  int c= a+b;
  System.out.println("the value of a is "+c);
}
}
// q3 show the Subtraction by using BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class test{
  int a,b,c;
  public static void main(String[] args) throws IOException {
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  int a = Integer.parseInt(reader.readLine());
  System.out.println("Enter the value of a" +a);
  int b = Integer.parseInt(reader.readLine());
  System.out.println("Enter the value of a" +b);
  int c = a-b;
  System.out.println("Enter the value of a" +c);
  }
}
// 2. Using Scanner Class: most preffered method using nowdays to getting input from user

//q1 getting input from user 
import java.util.Scanner;
public class test{
  public static void main(String[] args) {
    try (// here we take Scanner as package which got imported , then in is object name & new Scanner(System.in) is syntax just like new BufferedReader(new InputStreamreader(System.in)); in buffered class reader
Scanner in = new Scanner(System.in)) {
  String name = in.nextLine();
   // calling function as here we are nextline like readline() function in buffered class reader
  System.out.println("Enter the value of String:" +name);
}
}
}
/* Output:- javac test.java
java test
amit
Enter the value of String:amit */

// q2 getting input of the integer & float
import java.util.Scanner;
public class test{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value of a");
    int a = in.nextInt();
    System.out.println("the value of a is "+a);
    System.out.println("Enter the value of b");
    Scanner out = new Scanner(System.in);
    float b = out.nextFloat();
    System.out.println("the value of b is "+b);
  }
}
/*public static void main(String[] args)
public static void main(String []args)
public static void main(String args[]) the array notation [] can be used in many ways in java.
public static void main(String... args)*/
/*Can you save a java source file by other name than the class name?
Yes,if the class is not public.
<---------------------------------------------------------------------------------------->*/