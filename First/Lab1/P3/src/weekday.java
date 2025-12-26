import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class weekday {
    static void main() {
        int dayNo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number:");
        dayNo = sc.nextInt();

        LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();

        YearMonth yearMonthObject = YearMonth.of(year, month);
        int daysInMonth = yearMonthObject.lengthOfMonth();

        if (dayNo < 1 || dayNo > daysInMonth) {
            System.out.println("Invalid day number.");
        } else {
            LocalDate targetDate = LocalDate.of(year, month, dayNo);
            int dayValue = targetDate.getDayOfWeek().getValue();

            System.out.print("The weekday is: ");

            switch (dayValue) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
}
