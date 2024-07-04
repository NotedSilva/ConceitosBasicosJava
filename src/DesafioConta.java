import java.util.Scanner;

public class DesafioConta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = "";
        String tipoConta = "";
        double saldoInicial = 0;

        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        System.out.println("Digite o tipo da sua conta: 'Corrente' ou 'Poupança': ");
        tipoConta = input.nextLine();
        System.out.println("Digite o saldo da sua conta: ");
        saldoInicial = input.nextDouble();

        System.out.println("####################");
        System.out.println("Dados do cliente:");
        System.out.println("\nNome: "+nome);
        System.out.println("Tipo de conta: "+tipoConta);
        System.out.println("Saldo inicial: R$ "+saldoInicial);
        System.out.println("####################");

        int opcao = 0;
        System.out.println("Escolha uma opção:");
        System.out.println("\n1- Consultar saldo");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");
        System.out.println("Digite a opção desejada:");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("O seu saldo atual: R$ "+saldoInicial);
                break;

            case 2:
                System.out.println("Informe o valor de retirada: ");
                double saldoRetirado = input.nextDouble();
                double saldoFinal = saldoInicial - saldoRetirado;
                System.out.println("Seu saldo atualizado: R$ "+saldoFinal);
                break;

            case 3:
                System.out.println("Digite o valor de transferência: ");
                double valorTransferido = input.nextDouble();
                double valorFinal = saldoInicial - valorTransferido;
                System.out.println("Seu saldo atualizado: R$ "+valorFinal);
                break;

            case 4:
                System.out.println("Aplicação encerrada!");
                break;

            default:
                System.out.println("Opção inválida!");
                System.out.println("Digite um número entre 1 e 4");
                break;
        }
    }
}
