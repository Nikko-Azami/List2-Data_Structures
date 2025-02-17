import java.util.Scanner;

public class EleventhQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much days are on you year?");
        int yeardays = scanner.nextInt();

        if ((yeardays % 4 == 0) && ((yeardays % 100 != 0) || (yeardays % 400 == 0))) {
            System.out.println("There's a bisect year");
        } else {
            System.out.println("Isn't a bisect year");
        }

    }

}
