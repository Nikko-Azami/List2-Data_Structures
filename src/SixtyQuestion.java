/*Dessa vez, lhe iludiram e disseram que iam pagar para você fazer um programa, mas no fundo
você sabe que não vai receber. Você foi contratado para criar um programa de promoção do dia
1
do consumidor. Basicamente, você vai ler o total da compra de um consumidor e aplicar o
desconto conforme abaixo:
total compra desconto
< 50,00 5%
< 100,00 10%
< 200,00 20%
< 500,00 25%
>= 500, 00 30%
Por fim, você deve imprimir o valor total da compra após o desconto.*/

import java.util.Scanner;

public class SixtyQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's the total value of you grossness? ");
        double total = scanner.nextDouble();

        if (total <= 50){
            System.out.printf("Your discount is 5%% and you final bill is $%.2f", (total-(total/0.5/10)));
        } else if (total <100) {
            System.out.printf("Your discount is 10%% and you final bill is $%.2f", (total-(total/0.10/10)));
        } else if (total <200) {
            System.out.printf("Your discount is 20%% and you final bill is $%.2f", (total-(total/0.20/10)));
        } else if (total <500) {
            System.out.printf("Your discount is 25%% and you final bill is $%.2f", (total-(total/0.25/10)));
        } else if (total >=500) {
            System.out.printf("Your discount is 30%% and you final bill is $%.2f", (total-(total/0.30/10)));
        }
    }
}
