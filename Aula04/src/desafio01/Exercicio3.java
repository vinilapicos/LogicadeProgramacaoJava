/*
Instituto Proa - Jailson
Escreva um programa que leia dois números inteiros e informe qual deles é o maior. 
Vinicius Corrêa Carvalho
*/

package desafio01;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor aleatório: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite outro valor aleatório: ");
		int valor2 = sc.nextInt();
		if (valor1 > valor2) {
			System.out.println("O maior valor é o: " + valor1);
		} else if(valor1 == valor2) {
			System.out.println("Os valores são iguais.");
		} else {
			System.out.println("O maior valor é o: " + valor2);
		}
		sc.close();
	}
}