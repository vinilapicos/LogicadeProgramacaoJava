/*
Instituto Proa - Jailson
Escreva um programa que leia dois números e uma operação (adição, subtração, multiplicação ou divisão) e realize a operação correspondente. 
Vinicius Corrêa Carvalho
*/

package desafio01;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		float valor1 = sc.nextFloat();
		System.out.println("Digite o segundo número: ");
		float valor2 = sc.nextFloat();
		System.out.println("Digite o operador da expressão: ");
		String operador = sc.next();
		switch (operador) {
			case "+":
				System.out.println("O resultado da expressão é: " +valor1+" + "+valor2+" = "+(valor1+valor2));
				break;
			case "-":
				System.out.println("O resultado da expressão é: " +valor1+" - "+valor2+" = "+(valor1-valor2));
				break;
			case "/":
				System.out.println("O resultado da expressão é: " +valor1+" / "+valor2+" = "+(valor1/valor2));
				break;
			case "*":
				System.out.println("O resultado da expressão é: " +valor1+" * "+valor2+" = "+(valor1*valor2));
				break;
			default:
				System.out.println("O operador digitado é inválido (+ , - , / , * ).");
		}
		sc.close();
	}
}
