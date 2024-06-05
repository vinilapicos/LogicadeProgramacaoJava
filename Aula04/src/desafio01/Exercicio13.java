/*
Instituto Proa - Jailson

Escreva um programa que leia o valor de uma compra e a categoria do cliente (1 para comum, 2 para associado e 3 para VIP). Aplique os seguintes descontos: 
Comum: Sem desconto 
Associado: 10% de desconto 
VIP: 20% de desconto 
Informe o valor final da compra.  

Vinicius Corrêa Carvalho
*/

package desafio01;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da sua compra: ");
		float valorCompra = sc.nextFloat();
		System.out.println("Digite a sua categoria (1, 2 ou 3): ");
		int categoria = sc.nextInt();
		switch (categoria) {
			case 1:
				System.out.println("O valor final da compra será R$"+valorCompra);
				break;
			case 2:
				System.out.println("O valor final da compra será R$"+ (valorCompra*0.9));
				break;
			case 3:
				System.out.println("O valor final da compra será R$"+ (valorCompra*0.8));
				break;
			default:
				System.out.println("A categoria é inválida (1, 2 ou 3).");
		}
		sc.close();
	}
}
