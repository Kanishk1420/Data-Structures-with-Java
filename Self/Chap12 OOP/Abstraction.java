public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
    static abstract class Animal{
        void eat(){
            System.out.println("Eating");
        }
        abstract void walk();
    }
    static class Horse extends Animal{ // walk method horse kei pass hona hei chaiye
        void walk(){
            System.out.println("Walks on 4 legs");
        }
    }
    static class Chicken extends Animal{ // similarly walk method should pass to chicken 
        void walk(){
            System.out.println("Walks on 2 legs");
        }
    }
    }
