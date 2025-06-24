import java.util.Arrays;
import java.util.Collections;

public class Secondlargest {
    public static int second(Integer num[]) {
        int smallest = Integer.MIN_VALUE;
        Arrays.sort(num, Collections.reverseOrder());
        for (int i = 1; i < num.length; i++) {

            smallest = Math.max(smallest, num[i]);
            
        }
        return smallest;
    }
    public static int third(Integer num[]){
        int smallest = Integer.MIN_VALUE;
        if (num.length<3) {
            return -1;
        }
        Arrays.sort(num, Collections.reverseOrder());
        for (int i = 2; i < num.length; i++) {
            smallest = Math.max(smallest, num[i]);
        }
        return smallest;
    }
    public static void main(String[] args) {
        Integer num[] = { 12, 35, 1, 10, 34, 1 };
        System.err.println(second(num));
        System.err.println(third(num));
    }
}