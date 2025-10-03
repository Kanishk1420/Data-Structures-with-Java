public class MultipleInheritance {
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.eats();
        bear.sleeps();
        bear.hunts();
    }
    
    interface Herbivore {
        void eats();
        void sleeps();
    }
    
    interface Carnivore {
        void eats();
        void hunts();
    }
    
    static class Bear implements Herbivore, Carnivore {
        @Override /* @Override is optional but highly recommended 
        It's a compile-time check - helps catch errors early
        Works for both implementing interface methods and overriding parent class methods
If the method doesn't actually override/implement anything, you'll get a compiler error
*/
        public void eats() {
            System.out.println("Bear eats both plants and meat");
        }
        
        @Override
        public void sleeps() {
            System.out.println("Bear hibernates in winter");
        }
        
        @Override
        public void hunts() {
            System.out.println("Bear hunts for fish");
        }
    }
}
