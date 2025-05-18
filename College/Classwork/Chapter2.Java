/*                            CHAPTER 2- JAVA OOPS CONCEPTS 

 * 1) OBJECT:- Object means a real word entity such as pen, chair, table etc.
 * Any entity that has state and behavior is known as an object. For example: chair, pen, table, keyboard, bike etc.It can be physical and logical.
 
 * 2) CLASS :- Any entity that has state and behavior is known as an object. For example: chair, pen, table, keyboard bike etc. It can be physical and logical.
 * A class can also be defined as a blueprint from which you can create an individual object.
  
 *Object based programming language follows all the features of OOPs except Inheritance. JavaScript and VBScript are examples of object based programming
languages. 
  
A class is a group of objects which have common properties. It is a template or blueprint from which objects are created. It is a logical entity. It can't be physical.
A class in Java can contain:
*fields :- fields are the variables which we put into a class. like int id etc
*methods :- In java, a method is like function i.e. used to expose behavior of an object.
*constructors :- LATER
*blocks :- LATER
*nested class and interface :- LATER

**INSTANCE VARIABLE:- A variable which is created inside the class but outside the method, is known as instance variable.
*/

//example:-
class Student // creation of class
{
  int a = 5; // fields as int
  String Kanishk ; // field as string
public static void main(String args[]) // main 
{
Student s1=new Student(); // creation of object
System.out.println(s1.a); // print the field by calling it like we call a=5 to object s1 and then print it
System.out.println(s1.Kanishk); // as Kanishk string didnt contain any value so answer is null
}
}
//q2 Object and Class Example: main outside class
class Student {
    int id;
    String name;
  }
  public class test // as if you are applying public then your file name should be same.//
  {
    public static void main(String args[]) {
      Student s1 = new Student();
      System.out.println(s1.id);
      System.out.println(s1.name);
    }
  }
 /* 3 Ways to initialize object :
There are 3 ways to initialize object in java.
*By reference variable
*By method
*By constructor 
 */
// Object and Class Example : reference variable :
class Student{
    int id;
    String name;
    public static void main(String[] args) {
      Student r = new Student();
       r.id = 101;
       r.name= "Kanishk";
       System.out.println(r.id+""+r.name);
    }
  }
  //q2 creating multiple objects and initializing it
class Student{
    int id;
    String name;
    public static void main(String[] args) {
      Student r1 =new Student();
      Student r2 =new Student();
      r1.id= 101;
      r2.id= 102;
      r1.name= "Amit";
      r2.name= "Kanishk";
      System.out.println(r1.id+""+r2.id+""+r1.name+""+r2.name);
    }
  }
  // 2) Object and Class Example: Initialization through method : //
  //example
class Student{
    int idd;
    String namee;
    void insertRecord(int r, String n){ // creating method
       idd = r;       // equate the method into field
       namee = n;
    }
    void DisplayInformation(){
    System.out.println(idd+""+namee); // print it
    }
    public static void main(String[] args) { // main method
      Student r = new Student(); // creating object
      r.insertRecord(1, "Kanishk"); // intitlization the object with method and insert & diplay the value 
      r.DisplayInformation();
    }
  }
// q1 Object and Class Example: Employee class Employee,integer id=2205140, String='Rakesh', Salary is to be 40000.
// By Method and Intinlization of Object
//By Method
class Employee{
    int id;
    String name;
    float Salary;
    void insertRecord(int r, String n, float S){
    id=r;
    name=n;
    Salary=S;
    }
    void DisplayInformation(){
      System.out.println(id+""+name+""+Salary);
    }
    public static void main(String[] args) {
      Employee r = new Employee();
      r.insertRecord(2205140, "Kanishk", 40000);
      r.DisplayInformation();
    }
    //Intilization of object
    }
    class Employee{
        int id;
        String name;
        float Salary;
        public static void main(String[] args) {
          Employee r = new Employee();
          r.id=2205140;
          r.name="Rakesh";
          r.Salary=40000;
          System.out.println(r.id+""+r.name+""+r.Salary);
        }
        }
  //<--------->
  //q2 Object and Class Example: Rectangle by method
class Rectangle {
    int length;
    int breadth;
  
    void insert(int l, int b) {
        length = l;
        breadth = b;
    }
  
    void area() {
        int area = length * breadth;
        System.out.println("The area of is " + area);
    }
  
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.insert(5, 10);
        rect.area();
    }
}
// Object and Class Example: Rectangle by initilization.
class Rectangle {
    int length;
    int breadth;
    public static void main(String[] args) {
      Rectangle r = new Rectangle();
      r.length=20;
      r.breadth=40;
      int aera = r.length*r.breadth;
      System.out.println("The aera of Rectangle is :" +area);
    }
  }
  // <--------->
/*Anonymous simply means nameless. An object which has no reference is known as anonymous object. It can be used at the time of object creation only. 
 * If you have to use an object only once, anonymous object
is a good approach. For example:
new Calculation();//anonymous object
*/
// <-------------------------------------------------------------------------->