import java.util.Locale;
import java.util.Scanner;

public class ExecEstruturaCondicional06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        double numero;

        numero = leitor.nextDouble();

        if (numero < 0.0 || numero > 100.0) {
            System.out.println("Fora de intervalo");
        } else if (numero <= 25.0) {
            System.out.println("INTERVALO [0,25]");
        } else if (numero <= 50) {
            System.out.println("INTERVALO [25,50]");
        } else if (numero <= 75) {
            System.out.println("INTERVALO [50,75]");
        } else {
            System.out.println("INTERVALO [75, 100]");
        }

        leitor.close();
    }

}