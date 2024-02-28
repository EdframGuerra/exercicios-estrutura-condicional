import java.util.Scanner;

public class ExecEstruturaCondicional03 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int num1, num2;

        num1 = leitor.nextInt();
        num2 = leitor.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        leitor.close();
    }
}
