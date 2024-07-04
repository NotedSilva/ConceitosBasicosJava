import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println(("Qual o ano do lançamento? "));
        int anoLancamento = leitura.nextInt();
        System.out.println("Qual sua nota para o filme? ");
        double notaFilme = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(notaFilme);
    }
}
