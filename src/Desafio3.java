import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;

        System.out.println("Escolha uma opção:");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o lado do quadrado: ");
                double lado = input.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("A área do quadrado é: "+ areaQuadrado);
                break;

            case 2:
                System.out.println("Digite o raio do circulo: ");
                double raio =input.nextDouble();
                double areaCirculo = (raio * raio) * 3.14;
                System.out.println("A área do quadrado é: "+ areaCirculo);
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

    }
}
