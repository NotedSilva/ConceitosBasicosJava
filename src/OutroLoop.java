import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double mediaNota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Digite sua nota ou digite -1 para encerrar o programa ");
            nota = leitura.nextDouble();

            if (nota != -1)  {
                mediaNota += nota;
                totalNotas ++;
            }
        }
        System.out.println("Sua media total: " + mediaNota/totalNotas);
    }
}
