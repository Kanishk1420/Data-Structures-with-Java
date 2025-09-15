public class Constructors {
    public static void main(String[] args) {
    Student s1 = new Student();
    Setter s2 = new Setter("Kanishk");
    System.out.println(s2.nami);
    }
}
class Student{
    Student(){   // default constructor
    System.out.println("Constructor is called");
    }
}
class Setter{
    String nami; // Parameterized Constructor
    Setter(String name){
    this.nami = name;
     System.out.println("Parameterized Constructor is called");
    }
}
