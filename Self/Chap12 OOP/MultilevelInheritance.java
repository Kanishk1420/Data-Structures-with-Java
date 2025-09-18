public class MultilevelInheritance {
    public static void main(String[] args) {
    Dog s1 = new Dog();
    s1.eat();      
    s1.breed();
    s1.types();  
    }
}
class Animals{
    void eat(){
        System.out.println("Eating");
    }
}
class Mammals extends Animal{
    void types(){
        System.out.println("Sleep");
    }
}
class Dog extends Mammals {
    void breed(){
        System.out.println("German Shephead");
    }
}
