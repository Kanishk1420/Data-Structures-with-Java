public class Counter {
 static int count = 0; // will get memory only once and retain its value. instead creating different differnt instances.
 Counter(){
    count++;
    System.out.println(count);
 }
 static void counting(){
   for (int i = 0; i <= 12; i++) {
      System.out.println(count);
      count++;
   }
 }
 public static void main(String[] args) {
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    Counter c3 = new Counter();
    Counter.counting(); // calling static method here 
 }   
}
