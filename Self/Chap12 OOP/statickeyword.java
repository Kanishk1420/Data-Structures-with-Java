public class statickeyword {
    public static void main(String[] args) {
    Student s = new Student(23, "Kanishk");
    s.display();
    Student s2 = new Student(12, "Aman");
    s2.display();
    }
    static class Student {
        int roll; // instance variable
        String name;
        static String scoolname = "KIIT";

    Student(int r, String n){  // this block is also getter well 
    this.roll = r; // it refers to instance variable
    this.name = n;
    }
    void display(){
        System.out.println(roll+""+name+""+scoolname);
    }
    }
}

