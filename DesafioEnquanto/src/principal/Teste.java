package principal;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor do lado do triângulo equilátero: ");
	        double lado = scanner.nextDouble();

	        // Cálculo do Perímetro (soma dos 3 lados iguais)
	        double perimetro = 3 * lado;

	        // Cálculo da Área: (Lado² * √3) / 4
	        // Usamos Math.pow(lado, 2) para Lado² e Math.sqrt(3) para √3
	        double area = (Math.pow(lado, 2) * Math.sqrt(3)) / 4;

	        System.out.println("\n--- Resultados ---");
	        System.out.printf("Perímetro: %.2f\n", perimetro);
	        System.out.printf("Área: %.2f\n", area);

	        scanner.close();
	}

}
