/*Você agora quer fazer um programa apenas para exercitar a sua lógica. Basicamente, você viu que
o IBGE faz uma consulta de 5 preços para ver a média de preços. Você resolveu fazer o seguinte:
ler os valores, calcular a média e verificar quais valores estão acima da média.*/

import java.util.Scanner;

public class SeventhQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the first price: ");
        double price1 = scanner.nextDouble();
        System.out.println("Type the second price: ");
        double price2 = scanner.nextDouble();
        System.out.println("Type the third price: ");
        double price3 = scanner.nextDouble();
        System.out.println("Type the fourth price: ");
        double price4 = scanner.nextDouble();
        System.out.println("Type the fifth price: ");
        double price5 = scanner.nextDouble();


        double average = (price1 + price2 + price3 + price4 + price5) / 5;

        System.out.printf("The average of the prices are $%.2f and the prices that are above the average are: ", average);

        boolean foundAboveAverage = false;

        if (price1 > average) {
            System.out.print(price1 + " ");
            foundAboveAverage = true;
        }
        if (price2 > average) {
            System.out.print(price2 + " ");
            foundAboveAverage = true;
        }
        if (price3 > average) {
            System.out.print(price3 + " ");
            foundAboveAverage = true;
        }
        if (price4 > average) {
            System.out.print(price4 + " ");
            foundAboveAverage = true;
        }
        if (price5 > average) {
            System.out.print(price5 + " ");
            foundAboveAverage = true;
        }

        if (!foundAboveAverage) {
            System.out.println("Nenhum preço está acima da média.");
        }
    }
}
