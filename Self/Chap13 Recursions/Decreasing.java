public class Decreasing {
public static void decreasing(int n){
if(n==1){
System.out.print(n); // additional print for 1
return;
}
System.out.print(n);
decreasing(n-1); // here its print till 2
}

    public static void main(String[] args) {
        int n = 10;
        decreasing(n);
    }
}
