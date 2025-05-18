// Product loop 
public class Product {
public static void product(int a, int b){
   int c = a*b;
   System.out.println(c);

}
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        for (int i = 0; i <= 20; i++) {
            a=a+i;
            b=b+i;
            product(a,b);
        }
    }
}
