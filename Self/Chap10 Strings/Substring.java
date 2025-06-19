public class Substring {
    public static void substring(String str, int si, int ei){
    String subStr = "";
    for (int i = si; i < ei; i++) {
        subStr+= str.charAt(i);
    }
    System.err.println(subStr);
    //inbuilt functions
    System.err.println(str.substring(3,6));
    }
    public static void Alphabets(){
        for (char ch = 'A'; ch<='Z'; ch++) {
            System.err.print(ch+"");
        }
    }
    public static void main(String[] args) {
        String str = "Helloworld";
        substring(str, 3, 6);
        Alphabets();
    }
}
