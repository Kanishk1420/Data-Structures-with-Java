public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Kanishk");
        Student s3 = new Student("Zenitsu", 123);
        System.err.println(s2.name);
        System.out.println(s3.name+" "+s3.number);
    }
}
class Student {
    String name;
    int number;
    Student(){
       System.out.println("Construt"); 
    }
    Student(String name){
    this.name = name;
    }
    Student(String name, int number){
        this.name = name;
        this.number = number;
    }
}
