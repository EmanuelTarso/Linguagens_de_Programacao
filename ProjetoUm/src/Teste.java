import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Optional;

public class Teste {

        public static void main(String[] args) throws IOException {
            System.out.println("Olá, mundo!");
            char ch;
            ch = 'X';
            System.out.println("ch contains" + ch);
            ++ch; //incrementa ch
            System.out.println("ch is now" + ch);
            ch = 90;
            System.out.println("ch is now" + ch);
            byte tipoByte = 127;
            short tipoShort = 32767;
            char tipoChar = 'C';
            float tipoFloat = 2.6f;
            double tipoDouble = 3.59;
            int tipoInt = 2147483647;
            long tipoLong = 9223372036854775807L;
            boolean tipoBooleano = true;
            System.out.println("Valor do tipoByte =" + tipoByte);
            System.out.println("Valor do tipoShort =" + tipoShort);
            System.out.println("Valor do tipoChar =" + tipoChar);
            System.out.println("Valor do tipoFloat =" + tipoFloat);
            System.out.println("Valor do tipoDouble =" + tipoDouble);
            System.out.println("Valor do tipoInt =" + tipoInt);
            System.out.println("Valor do tipoLong =" + tipoLong);
            System.out.println("Valor do tipoBooleano =" + tipoBooleano);

            //Demonstra sequências de escape em strings.
            System.out.println("\nFirst line\nSecond line");
            System.out.println("A\tB\tC");
            System.out.println("D\tE\tF\n");

            // Demonstra valores booleanos.
            boolean b;
            b = false;
            System.out.println("b is " + b);
            b = true;
            System.out.println("b is " + b);

            //um valor booleano pode controlar a instrução if
            if (b) System.out.println("This is executed.");
            b = false;
            if (b) System.out.println("This is not executed.");

            // O resultado de um operador relacional é um valor booleano.
            System.out.println("10 > 9 is " + (10 > 9));

            // Demosntra escopo de bloco
            int m; //conhecida pelo código dentro de main
            m = 10;
            if (m == 10) { // inicia novo escopo
                int n = 20; //conhecida apenas nesse bloco
                // tanto m quanto n são conhecidas aqui
                System.out.println("m and n: " + m +" " + n);
                m = n * 2;

                // n = 100;
                // n ainda é conhecida aqui

                System.out.println("n is " + n);

                // Demonstra o tempo de vida de uma variavel
                for(int i=0; i < 3; i++);
            }
        }
}
