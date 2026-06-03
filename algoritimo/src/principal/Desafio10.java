package principal;

import java.util.Scanner;

public class Desafio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int linhas, colunas, LPersonagem, CPersonagem, posicaoAtual;
		String c01, c02, mov;
		
		System.out.print("Olá, insira a quantidade de linhas: ");
		linhas = teclado.nextInt();
		
		System.out.print("insira a quantidade de colunas: ");
		colunas = teclado.nextInt();
		
		System.out.print("insira o primeiro caractere: ");
		c01 = teclado.next();
		
		System.out.print("insira o segundo caractere: ");
		c02 = teclado.next();
		
		System.out.print("Informe a linha inicial do personagem: ");
		LPersonagem = teclado.nextInt();
		
		System.out.print("Informe a coluna inicial do personagem: ");
		CPersonagem = teclado.nextInt();
		
		
		while(true) {
			for(int l = 0; l <= colunas+3; l++) {
				System.out.print("-");
			}
			System.out.println("");
			
			for(int i = 0; i < linhas; i++) {
				System.out.print("| ");
				if((i % 2) == 0 ) {
					for(int j = 0; j < colunas; j++) {
						if(j == CPersonagem-1 && i == LPersonagem-1) {
							System.out.print("*");
						}else {
							System.out.print(c01);
						}
					}
					System.out.print(" |");
				}else {
					for(int k = 0; k < colunas; k++) {
						if(k == CPersonagem-1 && i == LPersonagem-1) {
							System.out.print("*");
						}else {
							System.out.print(c02);
						}
					}
					System.out.print(" |");
				}
					System.out.println("");
			}
			
			for(int l = 0; l <= colunas+3; l++) {
				System.out.print("-");
			}
			System.out.println("");
			System.out.println("");
			
			System.out.print("Informe o movimento (w,a,s,d): ");
			mov = teclado.next();
			
			switch(mov.toLowerCase()) {
				case "w":
					LPersonagem--;
					
					break;
				case "a":
					CPersonagem--;
					
					break;
				case "s":
					LPersonagem++;
					
					break;
				case "d":
					CPersonagem++;
					
					break;
				default:
					System.out.println("Erro ao registrar o movimento, tente novamente!");
			}
		}
		
		//teclado.close();
	}

}
