public class OOPS {
    public static void main(String[] args) {
        // public :- keyword (access specifer) the main method can call it from outside the class to start the program.
        // static: This is a keyword that allows the main method to be called without creating an instance (or object) of the class.
        // void:- keyword is used to give no return any value.
        // main:- main function starting.
        // String[] args: This is the parameter passed to the main method. It is an array of Strings that allows you to pass arguments to your program from the command line. For example, if you run java MyApp arg1 arg2, the args array will contain ["arg1", "arg2"].
        Pen p1 = new Pen(); // Pen() is a constructor & created a pen object called p1
        p1.setcolor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        Student p2 = new Student();
        p2.calculatepercentage(30, 40, 50);
        System.out.println(p2.percentage);
        p2.setname("Kanishk");
        p2.setage(21);
        System.out.println(p2.name);
        System.out.println(p2.age);
    }
}
class Pen{
String color;
int tip;
void setcolor(String newColor){
    color = newColor;
}
void setTip(int newTip){
    tip = newTip;
}
} 
class Student {
    String name;
    int age;
    float percentage;
    void setname(String newname){
        name = newname;
    }
    void setage(int newage){
        age = newage;
    }
    void calculatepercentage(int phy, int chem, int math){
        percentage = (phy + chem+ math)/3;
    }
}