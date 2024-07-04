import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numeroUm = input.nextInt();
        System.out.println("Digite o segunto número: ");
        int numeroDois = input.nextInt();

        if (numeroUm == numeroDois) {
            System.out.println("Os dois números são iguais!");
        } else {
            System.out.println("Os dois números são diferentes!");
        }
        if (numeroUm > numeroDois) {
            System.out.println("O número "+numeroUm+ " é maior que o número "+numeroDois);
        } else if (numeroUm < numeroDois){
            System.out.println("O número "+numeroUm+ " é menor que o número "+numeroDois);
        } else {
            System.out.println("Os números possuem o mesmo valor!");
        }

    }
}
