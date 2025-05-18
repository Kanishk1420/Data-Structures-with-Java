public class Practice {
    public static void main(String[] args) {
        int x = 200, y = 50, z = 100;
        
        if (x > y && y > z) {
            System.out.println("Hello");
        }
        
        if (z > y && z < x) {
            System.out.println("Java");
        }
        
        if ((y + 200) < x && (y + 150) < z) {
            System.out.println("Hello Java");
        }
        x = 9; 
        y=12;
        int a =2, b=4, c=6;
        int exp = 4/3 * (x + 34) +9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
        System.out.println(exp);
    }
}
