import java.util.*;
public class If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("Adult "+age);
        }
        else if(age>=12 && age<=18){
            System.out.println("Teenager "+age);
        }
        else{
            System.out.println("Child "+age);
        }
        sc.close();
    }
}
// in else if agar if condition true ho jati hei then it will directly print this and come in conculsion and in if only it will check every block like another if also 