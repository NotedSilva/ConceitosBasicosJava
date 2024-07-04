import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int numeroEscolhido = 0;
        int tentativas = 0;

        while (tentativas < 5){
            System.out.println("Digite um número entre 0 e 100, você só tem 5 tentativas, boa sorte!");
            numeroEscolhido = input.nextInt();
            tentativas++;

            if (numeroEscolhido == numeroAleatorio){
                System.out.println("Você acertou o número em " + tentativas + " tentativas");
                break;
            } else if (numeroEscolhido < numeroAleatorio) {
                System.out.println("O número escolhido é menor que o número aleatório!");
            } else {
                System.out.println("O número escolhido é maior que o número aleatório!");
            }
        }

        if (tentativas == 5 && numeroEscolhido != numeroAleatorio) {
            System.out.println("Suas tentativas acabaram, o número era: "+ numeroAleatorio);

        }
    }
}
