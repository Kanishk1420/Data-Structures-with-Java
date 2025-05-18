//                         CHAPTER 4 :- INHERITANCE IN JAVA  //
/*A new class from the existing class in such a way that new class can access all the features and properties of existing class is called inheritance 
 * So basically we want to acces the all the features of existing class from above so we will use extends keyword in inheritnace
 * its provide code reusiblitiy and method overriding 
 * we cant access private memebers of class through inheritance. 
 * so here we will call class as two types 
 * SUPER CLASS:- The exisiting class 
 * SUB CLASS :- extended class where we want to access the features of existing class.
*/
/*                                 TYPES OF INHERITANCE  
 * There are four types of Inheritance 
 * SINGLE :- Only contains one super class and only one sub sub class                super
 * ex:- class Super{} class Sub extends super{}                                        |
 *                                                                                    sub     */                
class student{
    int a = 90;
    int b = 40;   
}
class teacher extends student{
    int c = 4000;
    public static void main(String[] args) {
        teacher s1 = new teacher();
        teacher s2 = new teacher();
        System.out.println(s1.a);
        System.out.println(s2.b);
        System.out.println(s1.c);
    }
}
class Animal
{
void eat(){System.out.println("eating...");}
}
class Dog extends Animal
{
void bark(){System.out.println("barking...");}
}
class TestInheritance{
public static void main(String args[]){
Dog d=new Dog();
d.bark();
d.eat(); }
}
 /* MULTI LEVEL :- so here basically one super class conatin multiple Sub classes 
super
 |
 |
 sub1
 |
 |
 sub2
 |
 |
 sub3
 ex:-*/
 // q1 super class animal,print eating, dog sub class, print barking,sub class baby dog, print weeping,
class animal{
    void eat(){
        System.out.println("Eating");
    }
}
class Dog extends animal{
    void bark(){
        System.out.println("Barking");
    }
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("Weeping");
    }
    public static void main(String[] args) {
        animal s1 = new animal();
        Dog s2 = new Dog();
        BabyDog s3 = new BabyDog();
        s1.eat();
        s2.bark();
        s3.weep();
    }
}
//q2 Addition of two variables by using Single,Multi level inheritance
// Single level inheritance 
class student{
    int a = 20;
    int b = 30;
} 
class teacher extends student{
    int c;
    void calculate(){
        c =  a + b;
    }
    void display(){
        System.out.println(c);
    }
    public static void main(String[] args) {
        teacher s1 = new teacher();
        s1.calculate();
        s1.display();
    }
   }
   // Multi level inheritance 
class student{
    int a = 40;
    int b = 60;
}
class teacher extends student{
    int c = 47;
    int d = 68;
}
class principle extends teacher{
    int e ;
    void calculate(){
        e = a + b + c + d;
    }
    void display(){
      System.out.println(e);
    }
    public static void main(String[] args) {
        principle s1 = new principle();
        s1.calculate();
        s1.display();
    }
}
 /* MULTIPLE:- Where one sub class can be accessed by two super class it cant be possible through inheritance its possible by using interface. 
 super          super
 |               |                            JDK 21 IS LATEST VERSION OF JAVA NOWDAYS
   |           |
/      |     |
/       sub
 * HIERARICHAL:- A inheritance which contains only super class but it multiple sub class both sub classes shared its one super class Like:-
 * super___
    |     |
    |     |
sub 1    sub2 ex:- */ 
class student {
    void eat() {
        System.out.println("Eating");
    }

    class teacher extends student {
        void bark() {
            System.out.println("Barking");
        }
    }

    class principle extends student {
        void meow() {
            System.out.println("Meowww");
        }
    }
}
     class TestInheritance{
    public static void main(String[] args) {
        student s1 = new student();
        s1.eat();
        // s1.bark();
        // s1.meow();
    }
 }
//                AGGERATION IN JAVA : //
// If a class have an entity reference, it is known as Aggregation. Consider a situation, Employee object contains many informations such as id, name, emailId etc. It contains one more object named address, which contains its ownn informations such as city, state, country, zipcode etc. as given below. we use this for code reusiblity
class Address{
    String city,state,country;
     Address(String city, String state, String country){
     this.city=city;
     this.state = state;
     this.country = country;
     }
     void Display(){
     System.out.println(city+state+country);    
    }
}
class student extends Address{
    int id;
    String name;
    Address address;
    student(int id, String name,Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    void display(){
        System.out.println(name+id+address);
        System.out.println(address.city+address.state+address.country);
    }
}
class test{
    public static void main(String[] args) {
        student e1 = new student(111, "Kanishk",null);
        Address e2 = new Address("Bhubaneswar", "Odisha", "India");
        e1.display();
        e2.Display();
    }
}
// main method overloading 
class TestOverloading{

    public static void main(String[] args)
    {System.out.println("main with String[]");}
    
    public static void main(String args)
    {System.out.println("main with String");}
    
    public static void main()
    
    {System.out.println("main without args");}
    
    }
// Output as JVM only receives main() one or first one //

// method overloading in a class using mutliple methods  
class methodOverloading{
    void display(int a, int b){
        System.out.println(a+"a"+b+"b");
    }
    void Display(int a , int b , int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        methodOverloading e1 = new methodOverloading();
        e1.display(20, 30);
        e1.Display(34, 56, 70);
    }
}
// method overloading by using Scanner class
// method overloading by using Scanner class
import java.util.Scanner;
class methodOverloading{
    int a;
    int b;
    int c;
    void calculate(){
        c= b+a;
    }
    void display(){
        System.out.println(c);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        methodOverloading ni = new methodOverloading();
        ni.a =in.nextInt();
        ni.b = in.nextInt();
        ni.calculate();
        ni.display();
    }
}
// METHOD OVERRIDING :- So When we made the same function by extending the class by using inheritance then while using same function in that extended class then when we create objcet further then it will goes which type of function it will going to call so whenever it goes it will override that.. example //
// method override example
class method {
    void display(int a,int b){
   System.out.println(a+b);
   }
   }
   class methodOverriding extends method{
       void display(int a, int b){
       System.out.println(a+ "" +b);
       }
       public static void main(String[] args) {
           methodOverriding n = new methodOverriding(); // as it will first check methodoverrding class and then print the function of it first and then it will override the second one.
           n.display(30, 40);
       }
   }
   //another example of method overriding 
class Vehicle
{
void run(){System.out.println("Vehicle is running");}
}
class Bike extends Vehicle
{
void run()
{System.out.println("Bike is running safely");}
public static void main(String args[])
{
Bike obj = new Bike();
obj.run();
}
}
// we cannot override java main method and static method. Static belongs to class area and instance belongs to heap area.
/*What is method overriding vs overloading?
The main difference between overloading and overriding is that overloading occurs when methods in the same class have the same method name but different parameters, whereas overriding occurs when two methods have the same method name and parameters */
<________________________________________________________________________________________>
