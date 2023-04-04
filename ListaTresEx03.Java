import java.util.Scanner;

public class ListaTresEx03 {
	public static void main(String[] args) {

		double fahrenheit, celsius;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Programa - Conversão Fahrenheit para Celsius");
		System.out.println("Informe a temperatura em graus Fahrenheit: ");
		fahrenheit = scanner.nextDouble();

		celsius = (fahrenheit - 32) / 1.8;
		
		System.out.printf("O valor em graus celsius é: %.2f .", celsius);
		scanner.close();
	}
}