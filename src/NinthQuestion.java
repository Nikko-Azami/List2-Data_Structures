/*Um baralho contém 52 cartas de 4 tipos (naipes) diferentes: paus, espadas, copas e ouro. Em cada
naipe, que consiste de 13 cartas, 3 dessas cartas contêm as figuras do rei, da dama e do valete,
respectivamente. Faça um programa que leia um número de 1 a 13 e informe qual carta o número
representa por extenso. Lembrando que temos algumas cartas especiais: 1 (Ás), 11 (Jalete), 12
(Rainha), 13 (Rei)*/

import  java.util.Scanner;

public class NinthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's the number of the card you get?");
        int cardnumb = scanner.nextInt();

        if (cardnumb == 1){
            System.out.println("Your card is a AS");
        } else if (cardnumb == 2) {
            System.out.println("Your card is a two");
        } else if (cardnumb == 3) {
            System.out.println("Your card is a tree");
        } else if (cardnumb == 4) {
            System.out.println("Your card is a four");
        } else if (cardnumb == 5) {
            System.out.println("Your card is a five");
        } else if (cardnumb == 6) {
            System.out.println("Your card is a six");
        } else if (cardnumb == 7) {
            System.out.println("Your card is a seven");
        } else if (cardnumb == 8) {
            System.out.println("Your card is a eight");
        } else if (cardnumb == 9) {
            System.out.println("Your card is a nine");
        } else if (cardnumb == 10) {
            System.out.println("Your card is a ten");
        } else if (cardnumb == 11) {
            System.out.println("Your card is a valet");
        } else if (cardnumb == 12) {
            System.out.println("Your card is a queen");
        } else if (cardnumb == 13) {
            System.out.println("Your card is a king");
        } else {
            System.out.println("This card doesn't exists");
        }


    }
}
