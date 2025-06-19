public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'A'; ch<'Z'; ch++){
            sb.append(ch);
        }
        sb.toString();
        System.out.println(sb+" ");
    }
}
