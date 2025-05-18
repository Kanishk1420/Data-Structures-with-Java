//    CHAPTER 3 :- CONSTRUCTORS & METHODS                         
/*It is a special type of method which is used to initialize the object.
*Everytime an object is created using new() keyword, atleast one constructor is called. It is called a default constructor.
RULES:---
Constructor name must be same as its class name
Constructor must have no explicit return type
TWO TYPES OF CONSTRUCTORS 
1) DEFAULT CONSTRUCTORS
2) PARAMETERIZED CONSTRUCTORS
A constructor is called "Default Constructor" when it doesn't have any parameter.*/
Class A{
  a(){}
}
/* Example of Default Constructor*/
class bike {
    bike() {
        System.out.println("Bike is created");
    }

    public static void main(String args[]) {
        bike b = new bike();
    }

}
/*If there is no constructor in a class, compiler automatically creates a default constructor. 
 * like class A{                  class A{
/         ----------->              A(){}
 }                                      }
Default constructor is used to provide the default values to the object like 0, null etc. depending on the type.
one more example */
class student{
    int id = 76;
    String name = "Kanishk";
    void display(){
        System.out.println(+id +name);
    }
   public static void main(String[] args) {
    student s1 = new student();
    student s2 = new student();
    s1.display();
    s2.display();
   }
}
// A constructor which has a specific number of parameters is called parameterized constructor. 
public class student{
    int id;
    String name;
    student(int i,String n){
         id = i;
         name = n;
    }
    void display()
    { System.out.println(id+""+name);}
    public static void main(String[] args) {
        student s1 = new student(111,"Karan");
        student s2 = new student(222,"Amit");
        s1.display();
        s2.display();
    }
}
// output :- 111, Karan
// 222, Amit
//                            CONSTRUCTOR OVERLOADING IN JAVA              //
/*Constructor overloading in Java is a technique of having more than one constructor with different parameter lists.*/
public class student {
    int id;
    String name;
    int age;
    student(int i, String n){
        id = i;
        name = n;                   // constructor overloading two constructors within one class
    }
    student(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }
    void display(){
        System.out.println("your id,name,age is "+id+name +age);
    }
    public static void main(String[] args) {
        student s1 = new student(111, "Kanishk");
        student s2 = new student(111, "Amit", 23);
        s1.display();
        s2.display(); 
    }
    }
 /* Copy Constructor :- copies the values of one fully constructor ex:- */
 public class student {

    int id;
    String name;
    student(int i, String n){
        id = i;
        name = n;
    }
    student(student s){
        id = s.id;                      //copy contructor example
        name = s.name;
    }
    void display(){
        System.out.println(id+name);
    }
    public static void main(String[] args) {
        student s1 = new student(11, "Kanishk");
        student s2 = new student(s1);
        s1.display();
        s2.display();
    }
}
/*Does constructor return any value? No constructor doesnt return any value  
 * Can constructor perform other tasks instead of initialization?
Yes, like object creation, starting a thread, calling method etc. */

//                                      JAVA STATIC KEYWORD             //
/*The static keyword in java is used for memory management mainly. We can apply java static keyword with variables, methods, blocks and nested class. 
 * static can be apply is variable, method, block and nested class. basically it saves memory*/
//JAVA STATIC VARIABLE :-
public class student{

    int rollno;
    String name;
    static String college ="KIIT";
    student(int r,String n){
    rollno = r;
    name = n;
    }
    
    void display (){System.out.println(rollno+" "+name+""+college);}
    public static void main(String args[]){

        student s1 = new student(111,"Karan");   
        student s2 = new student(222,"Aryan");    
        s1.display();   
        s2.display();   
        }   
        }
        // output :- 111,KaranKIIT 222,AryanKIIT //
public class student{
int count = 1 ;
student(){
count++;    
}
void display(){
System.out.println(count);
}
public static void main(String[] args) {
student s1 = new student();
s1.display();
}
} // output = 2 
// JAVA STATIC KEYWORD :-------- If you apply static keyword with any method, it is known as static method.      
// A static method belongs to the class rather than object of a class.
public class student{
    int id;
    String name;
    static String n = "Kanishk";
    static void change(){
        n = "Ankit";
    }
         student(int i, String k){
             id = i;                                     // Static keyword example 
             name = k;
         }
    void display(){
        System.out.println(id+name+n);
    }
    public static void main(String[] args) {
        student.change();
        student s1 = new student(111, "Ankitt");
        s1.display();
    }
}
// calculate the aera of cube by static method 
public class student {

    static int aera;
    static int x = 5;

    static void calculate() {
        aera = x * x * x;
    }

    void display() {
        System.out.println(aera);
    }

    public static void main(String[] args) {
        student.calculate();
        student s1 = new student();
        s1.display();
    }
}
// calculate the aera of cube by static method  ex2
class aera{
    static void calculate(){
        int a=5;
        int b;  // non static variables in static method 
        b = a*a*a;
        System.out.println(b);
    }
    
    public static void main(String[] args) {
        aera.calculate();   // for calculating static method into static main use this
    }
}
//The static method can not use non static data member or call non-static method directly.
class A{
    int a=40;//non static
    public static void main(String args[]){
    System.out.println(a);
    // as our main method is staic and we cant print non static veriable into static method
    }
    }
 // this keyword:- this keyword is used when we want to initialize the same variable from class in same constructor.
 public class student {

    int id;
    String name;
    int Age;
    student(int id , String name){
        this.id=id;              //using this keyword 
        this.name=name; 
    }
    student(){
         id = id;
         name = name;            // without using this keyword
         Age=Age;
    }
    void display(){
        System.out.println(id +name);
    }
    public static void main(String[] args) {
        student s1 = new student(111, "Kanishk");
        student s2 = new student();
        s1.display();
        s2.display();
    }
} // output 111, Kanishk  0,null

class A {
    void m() {
        System.out.println("hello m");
    }
    void n() {                              // using this keyword method 
        System.out.println("hello n");
        this.m();

    }
public static void main(String args[]) {
    A a = new A();
    a.m();
    a.n();
}
}
// using this keyword constructor to call default to parameterized
class A {
    A() {
        System.out.println("hello a");
    }
    A(int x) {
        this();
        System.out.println(x);
    }
}

class TestThis {
    public static void main(String args[]) {
        A a = new A(10);
    }
}
// CONSTRUCTOR CHAINING //
public class student {
    int id;
    String name;
    float fee;
    static String k = "Kanishk";
    student(int id ,String name){
        this. id = id;
        this.name = name;
    }
    student(int id , String name, float fee){
        this(id, name); // reusing above constructor 
        this.fee = fee; 
    }
    void display(){
        System.out.println(id+"" +name+""+fee+""+k);
    }
    public static void main(String args[]){
      student s1 = new student(111, "Ankit");
      student s2 = new student(222, "Xiao", 2000);
      s1.display();
      s2.display();
    }
}
<---___________________________________________________________-->