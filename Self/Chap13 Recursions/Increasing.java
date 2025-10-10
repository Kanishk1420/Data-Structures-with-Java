public class Increasing {
    public static void increasing(int n){
    if(n==10){
    System.out.print(n+" ");
    return;
    }
    System.out.print(n+" ");
    increasing(n+1);
    }
    //OR
    public static void decreasingincrease(int r){
    if(r==1){
        System.out.print(r+" ");
        return;
    }
    decreasingincrease(r-1);
    System.out.print(r+" ");
    }
    public static void main(String[] args) {
        int n = 1;
        int r = 10;
        increasing(n);
        decreasingincrease(r);
    }
}
