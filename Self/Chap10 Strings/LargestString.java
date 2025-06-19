public class LargestString {
    public static void Largest(String str[]) {
    String name = str[0];
    for (int i = 1; i < str.length; i++) {
    if (name.compareTo(str[i])<0) { 
    name = str[i];
    }  
    }
    System.err.println(name);
    }

    public static void main(String[] args) {
        String str[] = { "Apple", "Banana", "Strawberry", "Watermelon", "Orange",
                "Mango", "Pineapple", "Kiwi", "Grapes", "Blueberry",
                "Peach", "Plum", "Cherry", "Pear", "Apricot" };
        Largest(str);
    }
}
