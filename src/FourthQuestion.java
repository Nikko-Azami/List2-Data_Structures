/*Na sua escola, você faz três avaliações no ano e a sua nota final é a média aritmética dessas três
avaliações. Para você ser aprovado sua média deve ser maior ou igual a 7.0 pontos, caso contrário
você estará reprovado. Faça um programa para ler suas notas e dizer se você está aprovado ou
reprovado.*/
import java.util.Scanner;

public class FourthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the grade of your first test: ");
        float grade1 = scanner.nextFloat();
        System.out.println("Type the grade of your second test: ");
        float grade2 = scanner.nextFloat();
        System.out.println("Type the grade of your third test: ");
        float grade3 = scanner.nextFloat();

        float media = (grade1 + grade2 + grade3) / 3;

        if (media >= 7) {
            System.out.printf("Your average final grade is %.2f and you're approved", media);
        }
        else {
            System.out.printf("Your average final grade is %.2f and you're reproved", media);
        }
    }
}
