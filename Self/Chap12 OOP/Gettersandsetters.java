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
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
    void setcolor(String newcolor){
        color = newcolor;
    }
    void settip(int newtip){
        tip = newtip;
    }
}
