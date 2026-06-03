package principal;

import java.util.Scanner;

public class Desafio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int linhas, colunas;
		String c01, c02;
		
		System.out.print("Olá, insira a quantidade de linhas: ");
		linhas = teclado.nextInt();
		
		System.out.print("Olá, insira a quantidade de colunas: ");
		colunas = teclado.nextInt();
		
		System.out.print("Olá, insira o primeiro caractere: ");
		c01 = teclado.next();
		
		System.out.print("Olá, insira o segundo caractere: ");
		c02 = teclado.next();
		
		for(int i = 0; i < linhas; i++) {
			if((i % 2) == 0 ) {
				for(int j = 0; j <= colunas; j++) {
					System.out.print(c01);
				}
			}else {
				for(int k = 0; k <= colunas; k++) {
					System.out.print(c02);
				}
			}
			System.out.println(" ");
			
		}
		
		teclado.close();
	}

}
