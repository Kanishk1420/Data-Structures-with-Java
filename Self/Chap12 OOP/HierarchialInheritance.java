public class HierarchialInheritance {
public static void main(String[] args) {
    Bird s1 = new Bird();
    s1.eat();
    s1.fly();
    Dog s2 = new Dog();
    s2.eat();
    s2.walk();
}
static class Animal{
    void eat(){
        System.out.println("Eating");
    }
}
static class Fish extends Animal{
    void swim(){
        System.out.println("Swiming");
    }
}
static class Dog extends Animal{
    void walk(){
        System.out.println("Walking");
    }
}
static class Bird extends Animal{
    void fly(){
        System.out.println("Flying");
    }
}
}