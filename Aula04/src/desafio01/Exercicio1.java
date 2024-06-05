/*
Instituto Proa - Jailson
Escreva um programa que leia um número inteiro e informe se ele é par ou ímpar. 
Vinicius Corrêa Carvalho
*/
package desafio01;

import java.util.Scanner;

public class Exercicio1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro aleatório: ");
		int valor = sc.nextInt();
		if ((valor%2) == 0) {
			System.out.println("O valor é par.");
		} else {
			System.out.println("O valor é impar.");
		}
		sc.close();
	}
}