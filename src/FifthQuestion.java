/*The Asa’s Club é um clube da cidade e você está trabalhando na portaria dela. As regras para
comprar ingressos para o clube são claramente machistas, mas elas são aplicadas. As mulheres
que chegarem até as 22h não pagam a entrada, mas depois desse horário, elas pagam metade do
valor do ingresso. Os homens que chegarem até as 22h pagam 70% do ingresso, enquanto depois
desse horário pagam o valor integral. Você que não perdeu tempo, fez um programa para a
portaria. Eu fico me perguntando porque tu se mete nessas coisas sem ganhar um centavo, mas
tudo bem.*/
import java.util.Scanner;

public class FifthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inform your gender; Type W for woman and M for man");
        char gender = scanner.next().charAt(0);

        System.out.println("What's you arrival time?");
        int arrivaltime = scanner.nextInt();
        
        if (gender == 'W' && arrivaltime <= 22){
            System.out.println("You don't pay");    
        } else if (gender == 'W') {
            System.out.println("You pay half ingress");
        } else if (gender == 'M' && arrivaltime <= 22) {
            System.out.println("You pay 70% of the ingress");
        } else if (gender == 'M') {
            System.out.println("You pay the total price");
        }
    }
}
