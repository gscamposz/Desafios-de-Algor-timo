package principal;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int figura, primeiraV;
		double conta = 0, lado = 0, base, altura, baseMenor, raizQuadrada;
		
		System.out.println("Olá, bem vindo. A seguir diga qual das opções de figura geométrica você deseja calcular!");
		
		while(true) {
			System.out.println("O que deseja calcular? selecione: ");
			System.out.println(" 1) Quadrilátero \n 2) Triângulo. \n 3) Sair");
			System.out.print("Sua opção: ");
			figura = teclado.nextInt();
			
			if(figura != 3) {
				switch(figura) {
					case 1:
						System.out.println("\nCerto, você quer calcular um tipo de Quadrilátero. Então diga qual: ");
						System.out.println(" 1) Quadrado\n 2) Retângulo\n 3) Trapézio\n 4) voltar");
						System.out.print("Sua opção: ");
						primeiraV = teclado.nextInt();
						
						switch(primeiraV) {
							case 1:
								System.out.println("\nVocê selecionou o Quadrado, agora informe as seguintes informações nescessárias para calcular:");
								System.out.print("Qual o valor do lado? ");
								lado = teclado.nextDouble();
								
								lado *= lado;
								
								System.out.println("A Área do quadrado é: " + lado + "\n");
								break;
							case 2:
								System.out.println("\nVocê selecionou o Retângulo, agora informe as seguintes informações nescessárias para calcular:");
								System.out.print("Qual o valor da base(comprimento)? ");
								base = teclado.nextDouble();
								
								System.out.print("E o valor da Altura(largura)? ");
								altura = teclado.nextDouble();
								
								conta = base * altura;
								
								System.out.println("A Área do Retângulo é: " + conta + "\n");							
								break;
							case 3:
								System.out.println("\nVocê selecionou o Trapézio, agora informe as seguintes informações nescessárias para calcular:");
								System.out.print("Qual o valor da base Maior? ");
								base = teclado.nextDouble();
								
								System.out.print("Qual o valor da base Menor? ");
								baseMenor = teclado.nextDouble();
								
								System.out.print("Qual o valor da altura? ");
								altura = teclado.nextDouble();
								
								conta = (base + baseMenor)*altura / 2;
								
								System.out.println("A Área do Trapézio é: " + conta + "\n");
								break;
							case 4:
								System.out.println("Você desejou voltar.\n");
								break;
							default:
								System.out.println("Nenhuma opção selecionada!\n");
						}
						
						break;
					case 2:
						System.out.println("\nCerto, você quer calcular um tipo de Triângulo. Então diga qual: ");
						System.out.println(" 1) Equilátero\n 2) Isosceles\n 3) Escaleno\n 4) voltar");
						System.out.print("Sua opção: ");
						primeiraV = teclado.nextInt();
						
						switch(primeiraV) {
							case 1:
								System.out.println("\nVocê selecionou o Equilátero, agora informe as seguintes informações nescessárias para calcular:");
								System.out.print("Qual o Lado do equilátero? ");
								lado = teclado.nextDouble();
								
								lado *= lado;
								raizQuadrada = Math.sqrt(3);
								
								conta = (lado * raizQuadrada) / 4;
								
								System.out.printf("A Área do Equilátero é %.2f", conta);
								System.out.println("\n");
								break;
							case 2:
								System.out.println("\nVocê selecionou o Isosceles, agora informe as seguintes informações nescessárias para calcular:");
								System.out.print("Qual a base? ");
								base = teclado.nextDouble();
								
								System.out.print("Qual a altura?");
								altura = teclado.nextDouble();
								
								conta = (base * altura) / 2;
								System.out.println("A Área do Isosceles é: " + conta + "\n");
								break;
							case 3:
								System.out.println("\nVocê selecionou o Escaleno, agora informe as seguintes informações nescessárias para calcular:");
								System.out.print("Qual a base? ");
								base = teclado.nextDouble();
								
								System.out.print("Qual a altura?");
								altura = teclado.nextDouble();
								
								conta = (base * altura) / 2;
								System.out.println("A Área do Isosceles é: " + conta + "\n");
								break;
							default:
								System.out.println("Nenhuma opção selecionada!\n");
						}
					default:
						if(conta == 0 || lado == 0) {
							System.out.println("Nenhuma opção selecionada!\n");
						}else {
							
						}
						
				}
			}else {
				System.out.println("Saindo do programa.\n");
				teclado.close();
				break;
			}
		}
	}
}