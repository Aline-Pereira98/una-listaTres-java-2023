import java.util.Scanner;

public class ListaTresEx02 {
	public static void main(String[] args) {

		double valor, novoValor;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Programa - Valor do Produto");
		System.out.println("Informe o valor do produto: ");
		valor = scanner.nextDouble();

		novoValor = valor / 10 + valor;
		
		System.out.printf("O novo valor do produto é: %.2f .", novoValor);
		scanner.close();
	}
}