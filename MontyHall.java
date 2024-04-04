import java.util.Scanner;
import java.util.Random;
public class Portas {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random random = new Random();
        int portaPremiada = random.nextInt(3) + 1;
        int portaVazia1 = 0, portaVazia2 = 0;
        int portaEscolhida;
        int portaAberta = 0;
        String trocou;

        if (portaPremiada == 1){
            portaVazia1 = 2;
            portaVazia2 = 3;
        } else if (portaPremiada == 2) {
            portaVazia1 = 1;
            portaVazia2 = 3;
        } else if (portaPremiada == 3) {
            portaVazia1 = 1;
            portaVazia2 = 2;
        }

        System.out.println("\nBem vindo ao jogo Monty Hall");
        System.out.println("\nEscolha uma dentre as 3 portas");
        portaEscolhida = scn.nextInt();

        if(portaEscolhida != portaVazia1) {
            System.out.println("\nO apresentador abre a porta " + portaVazia1 + " que esta vazia");
            portaAberta = portaVazia1;
        }
        else {
            System.out.println("\nO apresentador abre a porta " + portaVazia2 + " que esta vazia");
            portaAberta = portaVazia2  ;
        }
        System.out.println("\nDeseja trocar de porta? (digite s ou n)");


        if (portaEscolhida == portaPremiada) {
            System.out.println("\nVoce ganhou");
        } else {
            System.out.println("\nVoce perdeu");
        }
        System.out.println("A porta premiada era a " + portaPremiada);
        System.out.println("A porta escolhida foi a " + portaEscolhida);
        System.out.println("As portas vazias eram " + portaVazia1 + " e " + portaVazia2 );

    }
}
