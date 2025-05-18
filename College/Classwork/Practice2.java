
// Lab 3 - Course Contents: -class and objects in Java
//    -method overloading in Java
//   -constructor overloading in Java
/*1. Aim of the program :Write a class file – box with three data members(length, width, height) and a method volume() . Also implement the application class Demo where an object of the box class is created with user entered dimensions and volume is printed.
Input:  length,width and height.
Output: Volume */
import java.util.Scanner;

class Demo{
    int length;
    int width;
    int height;
    int Volume;
    void volume(){
     Volume = length*width*height;
    }
    void display(){
        System.out.println("Volume of box is"+Volume);
    }
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            Demo r = new Demo();
            r. length=in.nextInt();
            r. width = in.nextInt();
            r. height = in.nextInt();
            r.volume();
            r.display();
        }
    }
}

// 2. Aim of the program : Write a program in Java to create a class Rectangle
// having data members length and breadth and three methods called read,
// calculate and display to read the values of length and breadth, calculate the
// area and perimeter of the rectangle and display the result respectively.
// Create a class named 'Rectangle' with two data members 'length' and 'breadth'
// and
// two methods to print the area and perimeter of the rectangle respectively.
// Its constructor having parameters for length and breadth is used to
// initialize length
// and breadth of the rectangle.
// Create a class named 'Rectangle' with two data members 'length' and 'breadth'
// and
// two methods to print the area and perimeter of the rectangle respectively.
// Its constructor having parameters for length and breadth is used to
// initialize length
// and breadth of the rectangle.
// Output: Display Area of Rectangle and Perimeter of rectangle.
class Rectangle {
    int length;
    int breadth;
    int aera;
    int perimeter;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void aera() {
        aera = length * breadth;
    }

    void perimeter() {
        perimeter = 2 * (length + breadth);
    }

    void printaera() {
        System.out.println("The aera of rectangle is " + aera);
    }

    void printperimeter() {
        System.out.println("The perimeter of rectangle is " + perimeter);
    }

    public static void main(String[] args) {
        Rectangle in = new Rectangle(20, 40);
        in.aera();
        in.perimeter();
        in.printaera();
        in.printperimeter();
    }
}
// 3. Aim of the program : Write a program in java to input and display the
// details of n number of students having roll, name and cgpa as data members.
// Also display the name of the student having lowest cgpa.
// Input: Enter Roll No, Name and cgpa of ‘n’ number of students.
// Output: Display the details of ‘n’ number of students.
// import java.util.Scanner;
class student {
    int n;
    int rollno;
    String name;
    int cgpa;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        student r = new student();
        System.out.println("Enter the no of Students");
        r.n = in.nextInt();
        System.out.println("Enter the roll no of student");
        r.rollno = in.nextInt();
        System.out.println("Enter the name of Students");
        r.name = in.nextLine();
        System.out.println("Enter the cgpa of Student");
        r.cgpa = in.nextInt();
    }
}
// 4. Aim of the program : Write a program to overload subtract method with various parameters in a class in Java. Write the driver class to use the different subtract methods using object.
// Input:  Mention various subtract method having different parameters.
// Output: Subtract method will display the result accordingly
class Subtract {
    int a;
    int b;
    int c;

    void calculate() {
        c = a - b;
    }

    void Calculate() {
        c = b - a;
    }

    void display(String message) {
        System.out.println(message + c);
    }

    public static void main(String[] args) {
        Subtract n = new Subtract();
        n.a = 10;
        n.b = 5;
        n.calculate();
        n.display("Result of a - b: ");
        n.Calculate();
        n.display("Result of b - a: ");
    }
}
