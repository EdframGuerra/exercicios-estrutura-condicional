import java.util.Scanner;

public class ExecEstruturaCondicional02 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero = leitor.nextInt();

        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        leitor.close();
    }
}
