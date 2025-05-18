public class SyntaxFunction {
   public static int Sum(int a, int b){ // function defination or parameters
    int c = a+b; //----------------------------------- These both are not same they are scope
    return c;
   } 

    public static void main(String[] args) {

        int c = Sum(5, 6); //--------------------  These both are not same they are scope && functional arguments and callbacks 
        System.out.println(c);
    }
}
