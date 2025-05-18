/*                         TYPES OF VARIABLES USED IN JAVA             
 * Variable is name of reserved area allocated in memory.
 * int data=10;  Here data is variable
 * THERE ARE THREE TYPES OF VARIABLE:-
 * LOCAL VARIABLE
 * INSTANCE VARIABLE
 * STATIC VARIABLE
 1) LOCAL VARIABLE:- A variable declared inside the body of the method is called local variable. 
 You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.A local variable cannot be defined with "static" keyword.
 2) INSTANCE VARIABLE:- A variable declared inside the class but outside the body of the method, is called instance variable. It is not declared as static.
 3) ** STATIC VARIABLE:- A variable which is declared as static is called static variable. It cannot be local. You can create a single copy of static variable and share among all the instances of the class.
 
 Example of local variable:- */
 class Diff{
    void method()
    int n = 45; // local variable
 }
 class Sum{
    int k = 23;   // instance variable
    static int m = 56; // static variable
 }
// q1 perfrom addition,subtraction by using local variable and instance variable
// instance variable 
class test{
   public static void main(String[] args) {
   int a = 34;
   int b = 23;
   int c = a+b;
   int d = a-b;
       System.out.println(c);
       System.out.println(d);
   }
}
// predict the output of following:-
class Simple{

   public static void main(String[] args)
   {
   int a =10;
   float f =a;
   int b =(int)f;
   System.out.println(a);
   System.out.println(f);
   System.out.println(b);
   }
   }
   // output:- 10,10.0,10
   class Simple{
      public static void main(String[] args){
      int a=133;
      byte b=(byte)a;
      // 133 is outside the range of byte, so it will be converted to -123 due to overflow.
      System.out.println(a);
      System.out.println(b);
      }
  }
  // output:- 133,-123
/*Data types specify the different sizes and values that can be
 stored in the variable. There are two types of data types in
 Java:*/

/*  Primitive data types: The primitive data types include
 Integer, Character, Boolean, and Floating Point.

 Non-primitive data types: The non-primitive data types
 include Classes, Interfaces, and Arrays.*/
//There are 8 types of primitive data types:
// boolean data type         1 bit(T/F)
// byte data type            1 byte
// char data type            2 byte 
// short data type           2 byte
// int data type             4 byte
// long data type            8 byte
// float data type           4 byte
// double data type          8 byte
/*  Why java uses Unicode System ? 
ASCII etc */ 
//                         OPERATORS IN JAVA                     //
There are many types of operators in java which are
given below:
Unary Operator    X++, Y--,++X ,--Y ,+X,-Y,~!
Arithmetic Operator  *, / ,%, +, -
Shift Operator  <<, >>, >>>
Relational Operator < ,>, <=, >=, == , !=
Bitwise Operator   & -:AND, ^ | -: OR,   
Logical Operator   && -: AND, || -: OR,
Ternary Operator   ? 
Assignment Operator = ,+=, -=, *= ,/= ,%=,&=, ^=, |=, <<=, >>=,>>>=

// PREDICT THE OUTPUT
class OperatorExample{
   public static void main(String args[]){
   int x=10;
   System.out.println(x++); // First print then increment 10
   System.out.println(++x); // First increment then print 11
   System.out.println(x--); // First print then decrement 10
   System.out.println(--x); // First decrement then print 9
   }
}

class OperatorExample
{
public static void main(String args[]){
int a=10;
int b=10;
System.out.println(a++ + ++a); // 10+12= 22
System.out.println(b++ + b++); // 10+11= 21
}
}

class OperatorExample{
   public static void main(String args[]){
   int a=10;
   int b=-10;   
   boolean c=true;
   boolean d=false;
   System.out.println(~a); // ~ represents bitwise operator which will convert the integer number into bitwise like 10 into 1010 into 0101 which is -11 represnetation similar vice versa.
   System.out.println(~b);
   System.out.println(!c); // ! represents not operator which will reverse the operation.
   System.out.println(!d);
   }
}

class OperatorExample{
   public static void main(String args[]){
   System.out.println(10<<2);   // 1010 --> 101000 which represents 40
   System.out.println(10<<3);
   System.out.println(20<<2);
   System.out.println(15<<4);
   }
} 

class OperatorExample{
   public static void main(String args[]){
   int a=10;
   int b=5;
   int c=20;
   System.out.println(a<b&&a<c);//false && true = false
   System.out.println(a<b&a<c);//false & true = false
   }
} 

class OperatorExample{
   public static void main(String args[]){
   int a=10;
   int b=5;
   int c=20;
   System.out.println(a<b&&a++<c);//false && true = false (10<5, 10<20)
   System.out.println(a); 
   System.out.println(a<b&a++<c);//false & true = false   (10<5, 10<20)
   System.out.println(a);
   }
}
// The logical || operator doesn't check second condition if
// first condition is true. It checks second condition only if
// first one is false.

/* The bitwise | operator always checks both conditions
whether first condition is true or false. */

class OperatorExample{
   public static void main(String args[]){
   int a=10;
   int b=5;
   int c=20;
   System.out.println(a>b||a<c);   //t||t = t  first it check true it only checks second condition if false then it checks   
   System.out.println(a>b|a<c);    //t|t = t   it always check both condition.
   System.out.println(a>b||a++<c); //t||t = t
   System.out.println(a); 
   System.out.println(a>b|a++<c); // t|t = t
   System.out.println(a);
   }
}

class BreakExample {
   public static void main(String[] args) {
   for(int i=1;i<=10;i++){ 
   if(i==5){
   break;
   } 
   System.out.println(i);
   }
   } 
   } 
   // output:- 1,2,3,4
