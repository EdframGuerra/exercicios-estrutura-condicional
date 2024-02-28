import java.util.Scanner;

public class ExecEstruturaCondicional04 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;

        horaInicial = leitor.nextInt();
        horaFinal = leitor.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        leitor.close();
    }
}
