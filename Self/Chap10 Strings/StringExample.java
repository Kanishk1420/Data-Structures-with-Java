import java.util.Scanner;

public class StringExample {

    public static void creation(){
        char arr[] = {'a','b','c'};
        String str = "abcd";
        String str2 = new String("efgh");
        System.err.println(arr);
        System.err.println(str+""+str2);
        // Strings are Immutable
    }
    public static void Input(){
        System.err.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str3  = sc.nextLine();
        System.err.println("Output is "+str3);
        sc.close();
    }
    public static void length(String str){
        System.err.println(str.length());
        String firstname = "Boi";
        System.err.println(str.concat(firstname));
    }
    public static void charat(String str){
        for (int i = 0; i < str.length(); i++) {
            System.err.print(str.charAt(i));   
        }
        System.err.println();
    }
    public static void main(String[] args) {
       creation();
       Input();
       length("Kanishk Gupta");
       charat("Mauvika");
    }
}