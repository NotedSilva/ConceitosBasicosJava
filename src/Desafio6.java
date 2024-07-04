import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *=i;
        }
        System.out.println("O fatorial de "+numero+" é: "+fatorial);
    }
}
