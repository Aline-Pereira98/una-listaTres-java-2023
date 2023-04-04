import java.util.Scanner;

public class ListaTresEx10 {

	public static void main(String[] args) {

		double primeiroNumero, segundoNumero, terceiroNumero, aritmetica, harmonica, geometrica;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Programa - Cálculo de Médias");
		System.out.println("\nInforme o primeiro número: ");
		primeiroNumero = scanner.nextDouble();

		System.out.println("\nInforme o segundo número: ");
		segundoNumero = scanner.nextDouble();

		System.out.println("\nInforme o terceiro número: ");
		terceiroNumero = scanner.nextDouble();

		aritmetica = (primeiroNumero + segundoNumero + terceiroNumero) / 3;
		harmonica = 3 / ((1 / primeiroNumero) + (1 / segundoNumero) + (1 / terceiroNumero));
		geometrica = Math.pow((primeiroNumero * segundoNumero * terceiroNumero), 1.0 / 3.0);

		System.out.printf("\nMédia Aritmética: %.2f", aritmetica);
		System.out.printf("\nMédia Harmônica: %.2f", harmonica);
		System.out.printf("\nMédia Geométrica: %.2f", geometrica);

		scanner.close();
	}
}