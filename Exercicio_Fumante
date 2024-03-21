import java.util.Scanner;
public class Fumante {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int AnosF,QuantCig,CigVida;
        double PrecoMac, PrecoVida, TempoVidaPerdida;


        System.out.println("Digite por quantos anos fumou/fuma");
        AnosF = scn.nextInt();

        System.out.println("Digite o numero de cigarros fumados por dia");
        QuantCig = scn.nextInt();

        System.out.println("Digite o preco médio do maco de cigarro");
        PrecoMac = scn.nextDouble();


        CigVida = QuantCig * 365 * AnosF;

        PrecoVida = CigVida/20 * PrecoMac;

        TempoVidaPerdida = CigVida * 11 / 1440;

        System.out.println("A quantidade de cigarros fumados por toda a vida é de " + CigVida);
        System.out.println("O dinheiro gastado ao longo da vida é de " + PrecoVida);
        System.out.println("O tempo de vida perdido em dias foi de "+ TempoVidaPerdida);
