import java.util.Scanner;

public class TenthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the letter that you want to know if it is a vocal or a consonant");
        char letter = scanner.next().toUpperCase().charAt(0);


        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println("The letter you typed are a vocal");
        } else {
            System.out.println("The letter you typed are a consonant");
        }
    }
}
