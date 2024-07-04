public class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 200;
        double percentualDesconto = (precoOriginal / 100) * 10;
        double precoFinal = precoOriginal - percentualDesconto;
        System.out.println("R$" + precoOriginal + " reais, com 10% de desconto é igual a: R$" + precoFinal + "reais.");
    }
}
