// Type Promotion 
// byte > short > int > float > long > double
public class Prom {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        int y = (char) a;
        int z = (char) b;
        System.out.println(y+" "+z);
        int c =  (char)(b - a);
        System.out.println(c);

        short v = 5;
        byte n = 12;
        byte bt = (byte)(n+v+b); // type promotion to byte
        System.out.println(bt); 

        long f = 234567;
       double k = 34553434;
       float g = 345.56f;
       long m = (long)(f+g+k);
     System.out.println(m);

     byte h = 67;
     byte hk = (byte)(h*2);
     System.out.println(hk);
    }
}
