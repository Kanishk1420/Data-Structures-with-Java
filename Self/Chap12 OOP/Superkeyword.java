public class Superkeyword {
    public static void main(String[] args) {
    Horse h = new Horse();
    System.out.println(h.color);
    }
    static class Animal{
        String color;
        Animal(){
            System.err.println("Animal is called as Construtor");
        }
    }
    static class Horse extends Animal{
        Horse(){
            super();
            super.color = "Brown"; // properties
            System.out.println("Horse is called as Constructor");
        }
    }
}
