public class ConstructorChaining {
public static void main(String[] args) {
Student s1 = new Student(12, "Kanishk", 12000);
}
static class Student{
    int roll;
    String name;
    int fee;
  Student(int roll, String name){
  this.roll = roll;
  this.name = name;
  System.out.println("Patterns");
  }
  Student(int roll, String name, int fee){
      this(roll,name); // this is constructor chaining
      this.fee = fee;
  System.out.println("Second patterns");
  System.out.println(roll+" "+name+" "+fee);
  }
}
}
