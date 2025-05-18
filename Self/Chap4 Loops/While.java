import java.util.*;
public class While {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number which you want to print");
int loop = sc.nextInt();
int counter = 0;
while (loop>=counter) {
System.out.println("PRINTLN");
counter++;
}
System.out.println("Total Println"+counter);
sc.close();
}
}