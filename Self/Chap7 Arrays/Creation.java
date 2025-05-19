import java.util.Scanner;

public class Creation {

    public static void main(String[] args) {
        int arr[] = new int[50];
        Scanner sc = new Scanner(System.in);
        arr[0] = sc.nextInt(); //phy
        arr[1] = sc.nextInt(); //chem
        arr[2] = sc.nextInt(); //maths
        System.out.println("phy: " + arr[0] + " chem: " + arr[1] + " maths: " + arr[2]);
        System.out.println("Total: " + (arr[0]+arr[1]+arr[2]));
        arr[2]= arr[2]+1;
        System.out.println("Updated maths: " + arr[2]);
        int percentage = (arr[0]+arr[1]+arr[2])/3;
        System.out.println("percentage "+percentage+"%");
        System.out.println(arr.length); // determining array lenght 
        sc.close();
        
    }
}