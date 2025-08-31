import java.util.Arrays;

public class Duplicate {
    public static boolean arrays(int n[]){
        boolean result = false;
        for (int i = 0; i < n.length; i++) {
            for (int j = i+1; j < n.length; j++) {
                if (n[i]==n[j]) {
                    result = true;
                }
            }
        }
        return result;
    }
    public static boolean optimizedcontain(int n[]){
        Arrays.sort(n);
        for(int i=1; i<n.length; i++){
            if (n[i]==n[i-1]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(arrays(n));
        System.out.println(optimizedcontain(n));
    }
}
