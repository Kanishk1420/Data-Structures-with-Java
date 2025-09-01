public class Firstworduppercase {
    public static String largeststring(String fruits) {
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(fruits.charAt(0)));
        for (int i = 1; i < fruits.length(); i++) {
            if (fruits.charAt(i) == ' ' && i < fruits.length() - 1) {
                sb.append(fruits.charAt(i));
                i++;
                sb.append(Character.toUpperCase(fruits.charAt(i)));
            } else {
                sb.append(fruits.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String fruits = "mango is goat";
        System.out.println(largeststring(fruits));
    }
}
