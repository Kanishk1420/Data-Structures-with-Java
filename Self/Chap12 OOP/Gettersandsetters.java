public class Gettersandsetters {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setcolor("BLUE");
       System.out.println(p1.getColor());
       p1.settip(7);
       System.out.println(p1.gettip());
    }
}
class pen {
    private String color;
    private int tip;
    String getColor(){
        return this.color; // this keyword is used to refer to the current object.
    }
    int gettip(){
        return this.tip; // to return the value;
    }
    void setcolor(String newcolor){
        color = newcolor; // to modify the value;
    }
    void settip(int newtip){
        tip = newtip;
    }
}
