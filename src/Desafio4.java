import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroEntrada;

        System.out.println("Digite um número: ");
        numeroEntrada = input.nextInt();

        int multiplicador = 0;
        while (multiplicador <= 10 ){
            int resultado = numeroEntrada * multiplicador;
            System.out.println(resultado);
            multiplicador++;
        }
    }
}
