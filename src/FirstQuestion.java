/*Sofia tem oitos anos e está aprendendo os números, os antecessores e os sucessores. Você
resolveu fazer um programa para ajudá-la a saber se um número é sucessor de outro. Você
basicamente pede como entrada um número, depois o suposto sucessor, por fim exibe se o
suposto sucessor é o sucessor mesmo. É tipo assim: Sofia insere os números: 23 e, depois, 24 e
você vai exibir: “O número 24 é sucessor de 23”, mas se Sofia colocar 23 e, depois, 26, você deve
exibir: “O número 26 não é sucessor de 23”.*/

import java.util.Scanner;

public class FirstQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Type the second number: ");
        int number2 = scanner.nextInt();

        if (number2 ==number1 + 1 ){
            System.out.println("The number" + number2 + " is successor of " +number1);
        }
        else {
            System.out.println("The number" + number2 + " isn't successor of " +number1);
        }
    }

}
