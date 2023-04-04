import java.util.Scanner;

public class ListaTresEx05 {

	public static void main(String[] args) {

		double horasTrabalhadas, valorHora, salarioFamilia, numeroFilho, salarioBruto;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Programa - Salário Bruto da Empresa");
		System.out.println("Informe quantas horas você trabalhou esse mês: ");
		horasTrabalhadas = scanner.nextDouble();

		System.out.println("Informe o valor da hora: ");
		valorHora = scanner.nextDouble();

		System.out.println("Informe o valor do salário família: ");
		salarioFamilia = scanner.nextDouble();

		System.out.println("Informe quantos filhos(as) menor de 14 anos você possui: ");
		numeroFilho = scanner.nextDouble();

		salarioBruto = (horasTrabalhadas * valorHora) + numeroFilho * salarioFamilia;

		System.out.printf("O seu salário bruto a ser recebido é: $ %.2f .", salarioBruto);
		scanner.close();
	}
}