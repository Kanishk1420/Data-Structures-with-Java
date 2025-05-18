package Practice;

public class IsEven {
    public static boolean Iseven(int a){
    boolean even = false;
     if (a%2==0) {
        even = true;
    }
    else{
        even = false;
    }
    return even;
}
    public static void main(String[] args) {
        System.out.println(Iseven(6));
    }
}
