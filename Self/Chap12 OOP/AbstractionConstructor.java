public class AbstractionConstructor {
  public static void main(String[] args) {
    B rc = new B();
    System.out.println(rc.color);
    rc.changecolor();
    System.out.println(rc.color);
  }
  static abstract class A{
    String color;
    A(){
        color = "Brown";
        System.out.println("A called");
    }
  }
  static class B extends A{
    void changecolor(){
     color = "Dark Brown";
    }
    B(){              // aggar isse call karege toh it will overrides A constructor
        color = "Dark blue";
        System.out.println("B called");
    }
  }
}
