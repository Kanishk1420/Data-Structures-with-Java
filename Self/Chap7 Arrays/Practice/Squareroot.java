public class Squareroot {
    public static int mySqrt(int x){
    return (int)Math.sqrt(x);
    }
    public static boolean isPerfectSquare(int num){
    double f = num*0.5;
    int g = (int)(num*0.5);
    if(f==g)
    return true;
    return false;
    }
    public static void main(String[] args) {
      System.out.println(mySqrt(4));
      System.out.println(isPerfectSquare(16)); 
    }
}
