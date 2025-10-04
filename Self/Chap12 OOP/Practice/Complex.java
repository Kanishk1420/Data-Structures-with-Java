public class Complex {
public static String sum(String num1, String num2){
String n1[] = num1.split("\\+");
String n2[] = num2.split("\\+");
int a = Integer.parseInt(n1[0]);
int b = Integer.parseInt(n1[1].replace("i", ""));
int c = Integer.parseInt(n2[0]);
int d = Integer.parseInt(n2[1].replace("i", ""));
int real = a + c;
int imaginary = b + d;
return real + "+" + imaginary+ "i";
}
public static String difference(String num1, String num2){
String n1[] = num1.split("\\+");
String n2[] = num2.split("\\+");
int a = Integer.parseInt(n1[0]);
int b = Integer.parseInt(n1[1].replace("i", ""));
int c = Integer.parseInt(n2[0]);
int d = Integer.parseInt(n2[1].replace("i", ""));
int real = a - c;
int imaginary = b - d;
return real + "+" + imaginary+ "i";
}
    public static void main(String[] args) {
        System.out.println(sum("1+1i", "1+1i"));
        System.out.println(difference("-1+2i", "3+4i"));
    }
}