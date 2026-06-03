package principal;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int linhas;
		
		System.out.print("Olá, insira a quantidade de linhas: ");
		linhas = teclado.nextInt();
		
		for(int i = 0; i < linhas; i++) {
			System.out.println("____________");
		}
		
		teclado.close();
	}

}
