public class Inheritance {
    public static void main(String[] args) {
        Fish s1 = new Fish();
        s1.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Eating");
    }
    void sleep(){
        System.out.println("Sleeping");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swiming");
    }
}
