public class Ternary {
    // variable = condition? statement1: statement2;
    public static void main(String[] args) {
        int number = 12;
        String type = ((number%2==0))? "Even" : "Odd";
        System.err.println(type);
        boolean typ = (number%2==0)? true : false;
        System.out.println(typ);
        int marks = 32;
        String mar = (marks>=33 && marks<33)? "Pass" : "Fail";
        System.out.println(mar);
    }
}
