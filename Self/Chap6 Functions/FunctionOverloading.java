public class FunctionOverloading {
    public static int mul(int a, int b){
        return a*b;
    }
    public static int mul(int a, int b, int c){
        return a*b*c;
    }
    public static float mul(float a, float b, float c){ // functional overloading by datatypes
        return a*b*c;
    }
    public static void main(String[] args) {
        System.out.println(mul(2, 4));
        System.out.println(mul(2, 4, 6));
        System.out.println(mul(2.4f, 4.5f, 6.7f));
    }
}
// Function overloading depends on parameters not on return types