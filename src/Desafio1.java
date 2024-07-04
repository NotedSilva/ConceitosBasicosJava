import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroPositivo = input.nextInt();

        if (numeroPositivo >= 0 ) {
            System.out.println("Número positivo!");
        }  else {
            System.out.println("Número negativo!");
        }
    }
}
