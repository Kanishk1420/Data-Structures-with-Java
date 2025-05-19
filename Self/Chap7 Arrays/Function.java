// Call by refernce 
public class Function {
    public static void Array(int marks[]){
     for (int i = 0; i < marks.length; i++) {
        marks[i] = marks[i]+1;
        System.out.print(marks[i]+" ");
     }
    }
    public static void main(String[] args) {
        int marks[] = {98,45,67};
        Array(marks);
    }
}
