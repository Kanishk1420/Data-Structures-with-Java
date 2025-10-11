public class Sumofnatruralno {
    public static int natrual(int n){
    if(n==0){
    return 0;
    }
    int sum = n + natrual(n-1);
    return sum;       
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(natrual(n));
    }
}
