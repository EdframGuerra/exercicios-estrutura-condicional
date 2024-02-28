import java.util.Scanner;

public class ExecEstruturaCondicional01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();

        if (numero > 0) {
            System.out.println("NÃO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }

        leitor.close();
    }
}