import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double mediaNota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua nota: ");
            nota = leitura.nextDouble();
            mediaNota += nota;
        }
        System.out.println("Sua media total: " + mediaNota/3);
    }
}
