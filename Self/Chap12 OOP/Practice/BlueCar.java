abstract class Car {
    static {
        System.out.print("1");
    }
    
    public Car(String name) {
        super();
        System.out.print("2");
    }
    
    {
        System.out.print("3");
    }
}

public class BlueCar extends Car {
    {
        System.out.print("4");
    }
    
    public BlueCar() {
        super("blue");
        System.out.print("5");
    }
    
    public static void main(String[] args) {
        new BlueCar();
    }
}
/*main() 
  ↓
new BlueCar()
  ↓
[Class Loading] → Static block in Car → Print "1"
  ↓
BlueCar() constructor called
  ↓
super("blue") → Jump to Car constructor
  ↓
Instance block in Car → Print "3"
  ↓
Car constructor body → Print "2"
  ↓
[Back to BlueCar]
  ↓
Instance block in BlueCar → Print "4"
  ↓
BlueCar constructor body → Print "5" 

Output is 13245 */