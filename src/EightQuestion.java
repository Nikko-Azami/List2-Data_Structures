/*Em um jogo de tabuleiro, um jogador pode movimentar uma peça apenas se o número do seu
dado for maior que o do seu adversário. Faça um programa que informe se o jogador pode ou não
jogar aquela partida. Leia o número do dado do jogador e do seu adversário e informe quem deve
jogar. No caso de empate, nenhum dos jogadores joga*/

import java.util.Scanner;

public class EightQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First player has to roll the dice and type the number: ");
        int dice1 = scanner.nextInt();
        System.out.println("Second player has to roll the dice and type the number: ");
        int dice2 = scanner.nextInt();

        if (dice1 > dice2){
            System.out.println("The player 1 has a bigger number, so he can play and player 2 cannot");
        }
        else {
            System.out.println("The player 2 has a bigger number, so he can play and player 1 cannot");
        }
    }

}
