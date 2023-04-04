import java.util.Scanner;

public class ListaTresEx01 {
	public static void main(String[] args) {

		double numeroUm, numeroDois, mediaAritmetica;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Média Aritmética");
		System.out.println("Informe o primeiro número: ");
		numeroUm = scanner.nextDouble();

		System.out.println("Informe o segundo número: ");
		numeroDois = scanner.nextDouble();

		mediaAritmetica = (numeroUm + numeroDois) / 2;
		
		System.out.printf("A média aritmética é: %.2f", mediaAritmetica);
		scanner.close();
	}
}