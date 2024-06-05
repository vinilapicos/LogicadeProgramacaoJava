/*
Instituto Proa - Jailson

Escreva um programa que leia o código de um produto e informe a sua categoria:
 
1 a 10: Alimento não-perecível 
11 a 20: Alimento perecível 
21 a 30: Vestuário 
31 a 40: Eletrônicos 
Outros: Código inválido
 
Vinicius Corrêa Carvalho
*/

package desafio01;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código do produto:");
		int codigo = sc.nextInt();
		if(codigo<0 || codigo>40){
			System.out.println("Código inválido");	
		}else if (codigo<=10) {
			System.out.println("O produto é da categoria Alimento não-perecível.");
		} else if (codigo<=20){
			System.out.println("O produto é da categoria Alimento perecível.");
		} else if (codigo<=30){
			System.out.println("O produto é da categoria Vestuário.");
		} else if (codigo<=40){
			System.out.println("O produto é da categoria Eletrônicos.");
		}
		sc.close();
	}
}
