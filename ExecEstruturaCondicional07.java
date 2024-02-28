import java.util.Locale;
import java.util.Scanner;

public class ExecEstruturaCondicional07 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        double x, y;

        x = leitor.nextDouble();
        y = leitor.nextDouble();

        if (x == 0.00 && y == 0.00) {
            System.out.println("Origem");
        } else if (x == 0.00) {
            System.out.println("Eixo X");
        } else if (y == 0.00) {
            System.out.println("Eixo Y");
        } else if (x > 0.00 && y > 0.00) {
            System.out.println("Q1");
        } else if (x < 0.00 && y > 0.00) {
            System.out.println("Q2");
        } else if (x < 0.00 && y < 0.00) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }
        leitor.close();
    }
}
