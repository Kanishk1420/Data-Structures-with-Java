package Practice;
import java.time.LocalDate;
public class Practice3 {
    public static void main(String[] args) {
        // Get the current date and determine the day of the week
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        int week = currentDate.getDayOfWeek().getValue(); // Get week number (1 for Monday, 7 for Sunday)

        switch (week) {
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunday");
                break;
            default: System.out.println("Invalid Week");
                break;
        }
    }
}
