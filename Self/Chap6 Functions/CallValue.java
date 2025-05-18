public class CallValue {
    public static void swap(int a, int b){
        
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("A value is after swap "+a);
        System.out.println("B Value is after swap "+b);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println("A value is before swap "+ a);
        System.out.println("B Value is before swap "+ b); 
        swap(a,b);
    }
}
