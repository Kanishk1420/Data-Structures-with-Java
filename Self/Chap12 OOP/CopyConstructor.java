public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student(10, "LearnCode");
        // Now, let's use the copy constructor
        Student s2 = new Student(s1);
        System.out.println(s2.a + " " + s2.b);
    }
}
class Student{
    int a;
    String b;

    Student(int a, String b){
        this.a = a;
        this.b = b;
        System.out.println(this.a + " " + this.b);
    }

    //shallow copy constructor
    Student(Student s1){
        this.a = s1.a;
        this.b = s1.b;
    }
}