package desafios_udemy;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero: ");
		double a = scan.nextDouble();

		System.out.println("Digite o segundo n�mero: ");
		double b = scan.nextDouble();

		System.out.println("Informe a opera��o: ");
		String op = scan.next();

		double resultado = "+".equals(op) ? a + b : 0;
		resultado = "-".equals(op) ? a - b : resultado;
		resultado = "*".equals(op) ? a * b : resultado;
		resultado = "*/".equals(op) ? a / b : resultado;

		System.out.printf("%.2f %s %.2f = %.2f", a, op, b, resultado);

		scan.close();

	}
}