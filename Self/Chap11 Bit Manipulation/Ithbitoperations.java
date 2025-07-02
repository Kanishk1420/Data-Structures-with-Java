public class Ithbitoperations {
    public static void getith(int n, int i){
        if ((n & (1<<i)) == 0) {
            System.err.println(0);
        }
        else {
            System.err.println(1);
        }
    }
    public static void setithbit(int n, int i){
        System.err.println(n|1<<i);
    }
    public static void clearithbit(int n, int i){
        System.err.println(n & ~(1<<i));
    }
    public static void updateithbit(int n, int i, int bit){
        if (bit ==0) {
            // clearithbit(n, bit);
            System.err.println(n & ~(1<<i));
        }
        else {
            // setithbit(n, bit);
            System.err.println(n | (1<<i));
        }
    }
    public static void clearlastithbit(int n, int i){
        System.err.println(n & (-1<<i));
    }
    public static void main(String[] args) {
        getith(15,2);
        setithbit(10, 2);
        clearithbit(15, 1);
        updateithbit(15, 1, 0);
        clearlastithbit(15, 2);
    }
}
