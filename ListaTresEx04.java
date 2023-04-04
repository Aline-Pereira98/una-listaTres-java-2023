import java.util.Scanner;

public class ListaTresEx04 {
	public static void main(String[] args) {

		double valorCapital, prazo, jurosMensal, jurosPorcentagem, montante;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Programa - Cálculo de Juros Compostos");
		System.out.println("Informe o valor do capital a ser investido: ");
		valorCapital = scanner.nextDouble();

		System.out.println("Informe o prazo da aplicação em meses: ");
		prazo = scanner.nextDouble();

		System.out.println("Informe a taxa de juros mensal: ");
		jurosMensal = scanner.nextDouble();

		jurosPorcentagem = jurosMensal / 100;

		montante = valorCapital * Math.pow((1 + jurosPorcentagem), prazo);

		System.out.printf("Você receberá: $ %.2f .", montante);
		scanner.close();
	}
}