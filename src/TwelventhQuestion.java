import java.util.Scanner;

public class TwelventhQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxdays;
        String yeartype = ""; // Initialize yeartype

        System.out.println("Type the year: ");
        int year = scanner.nextInt();
        System.out.println("Type the month: ");
        int month = scanner.nextInt();
        System.out.println("Type the day: ");
        int day = scanner.nextInt();

        // Determine if the year is a leap year and assign yeartype
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            yeartype = "bisect"; // Assign "bisect" if it's a leap year
        } else {
            yeartype = "not bisect"; // Assign "not bisect" if it's not a leap year
        }

        if (year > 1900) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
                    || month == 12) {
                maxdays = 31;
            } else if (month == 2) {
                if (yeartype.equals("bisect")) { // Check for leap year in February
                    maxdays = 29;
                } else {
                    maxdays = 28;
                }
            } else if (month > 12 || month < 1) { // Check for invalid month before setting maxdays
                System.out.println("This isn't a valid month");
                scanner.close();
                return; // Exit the program if the month is invalid
            } else {
                maxdays = 30;
            }

            if (day > maxdays || day < 1) { // Check if the day is valid
                System.out.println("This isn't a valid day");
            } else {
                System.out.printf("Your date is correct and validated! Your year is %s\n", yeartype);
            }

        } else {
            System.out.println("This isn't a valid year");
        }

        scanner.close();
    }
}
