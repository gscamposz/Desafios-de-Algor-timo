package principal;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int linhas;
		
		System.out.print("Olá, insira a quantidade de linhas: ");
		linhas = teclado.nextInt();
		
		for(int i = 0; i < linhas; i++) {
			if((i % 2) == 0 ) {
				System.out.println("____________");
			}else {
				System.out.println("XXXXXXXXXXXX");
			}
			
		}
		
		teclado.close();
	}

}
