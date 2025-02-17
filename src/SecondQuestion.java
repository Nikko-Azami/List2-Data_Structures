/*Você viu na televisão que esse inverno vai ser rigoroso no Brasil. Decidiu então que vai monitorar a
temperatura da sua cidade. Se as temperaturas estiverem abaixo de 17ºC, você vai exibir na tela:
“Frio da moléstia", mas caso contrário: “Tudo normal nas terras de Cuçumarim”.*/

import java.util.Scanner;

public class SecondQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the temperature: ");
        double temperature = scanner.nextDouble();

        if (temperature < 17) {
            System.out.println("It's rlly cold ");
        }
        else{
                System.out.println("Everything normal on the dirts of Cucumarim"); // my keyboard doesn't have c with cedilha
            }
        }
    }

