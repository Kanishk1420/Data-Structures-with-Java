public class Countoperationzero {
    public static int Countoperations(int num1 , int num2){
        int count = 0;
        while((num1!=0) && (num2!=0)){
           count++;
           if(num1 >= num2){
           num1 = num1-num2;
           }
           else{
           num2 = num2-num1;
           }
        }
        return count;
    }
    public static int numberofSteps(int num){
        int count = 0;
        while(num!=0){
            count++;
            if(num % 2 == 0)
            num = num / 2;
            else
            num--;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(Countoperations(2, 3));
        System.out.println(numberofSteps(14));
    }
}
