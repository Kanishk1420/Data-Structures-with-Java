package Practice;
import java.time.*;
public class Practice4 {
    public static void main(String[] args) {
        LocalDate year = LocalDate.now();
        int yearr = year.getYear();
        if (yearr % 4 == 0) {
            System.out.println(yearr+" IS LEAP YEAR");
        }
        else {
            System.out.println(yearr+" IS NOT LEAP YEAR");
        }
    }
}
