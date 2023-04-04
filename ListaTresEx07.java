import java.util.Scanner;

public class ListaTresEx07 {

	public static void main(String[] args) {

		double salarioFixo, totalVenda, percentualGanho, percentualTotal, salarioTotal;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Programa - Salario Total Vendedor");
		System.out.println("Informe o seu salario fixo: ");
		salarioFixo = scanner.nextDouble();

		System.out.println("Informe o valor total das vendas realizadas neste mes: ");
		totalVenda = scanner.nextDouble();

		System.out.println("Informe o percentual de ganho nessas vendas: ");
		percentualGanho = scanner.nextDouble();

		percentualTotal = percentualGanho / 100;
		salarioTotal = salarioFixo + (totalVenda * percentualTotal);

		System.out.printf("Você receberá: $ %.2f .", salarioTotal);
		scanner.close();
	}
}