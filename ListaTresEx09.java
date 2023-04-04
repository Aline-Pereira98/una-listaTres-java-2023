import java.util.Scanner;

public class ListaTresEx09 {

	public static void main(String[] args) {

		double hora, minuto, segundo;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Programa - Conversão de Segundos");
		System.out.println("Informe a quantidade de segundos: ");
		segundo = scanner.nextDouble();

		minuto = segundo / 60;
		hora = segundo / 3600;

		System.out.printf("\nSegundos: %.0f \nMinutos: %.2f \nHoras: %.2f .", segundo, minuto, hora);
		scanner.close();
	}
}