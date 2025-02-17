/*Você sabe que o “par ou ímpar” é o modo tradicional de escolher algo pela sorte.
Normalmente, as duas pessoas usam apenas uma mão e escolhem o número de dedos que
desejam. Você soma o total de dedos e verifica se o número é ímpar ou par.
Um número é par se a sua divisão inteira por 2 resta zero, um número é ímpar no
 caso contrário. Então, faça isso. Leia o número de dedos da
mão de cada jogador e diga se o resultado deu ímpar ou par.*/

import java.util.Scanner;

public class ThirdQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Say the number of fingers of the first player: ");
        int fingerp1 = scanner.nextInt();
        System.out.println("Say the number of fingers of the second player: ");
        int fingerp2 = scanner.nextInt();


        int totalfingers = (fingerp1 + fingerp2) % 2;

        if (totalfingers == 0) {
            System.out.println("The final result is odd");
        }
        else {
            System.out.println("The final result is even");
        }

    }
}
