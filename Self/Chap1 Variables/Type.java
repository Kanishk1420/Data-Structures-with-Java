public class Type {
    // converting a double to float then to int
    public static void main(String[] args) {
        double a = 25.896;   // original double value
        float c = (float) a; // converting double to float
        int b = (int) c;     // converting float to int (data loss occurs)
        System.err.println(b);

        float marks = 99.999f;
        int mark = (int) marks;
        System.out.println(mark);
    } 
}
