import java.util.Scanner;

public class ListaTresEx06 {

	public static void main(String[] args) {

		double baseLogaritmo, logaritmo, logaritmando;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Programa - Cálculo Logarítmo");
		System.out.println("Informe o logaritmando: ");
		logaritmando = scanner.nextDouble();

		System.out.println("Informe a base: ");
		baseLogaritmo = scanner.nextDouble();

		// 1024 base 2 = 10
		logaritmo = Math.log(logaritmando) / Math.log(baseLogaritmo);

		System.out.printf("O seu logaritmo é: %.2f .", logaritmo);
		scanner.close();
	}
}