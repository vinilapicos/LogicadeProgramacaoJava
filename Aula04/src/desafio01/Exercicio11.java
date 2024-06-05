/*
Instituto Proa - Jailson
Escreva um programa que leia um número e verifique se ele está no intervalo de 10 a 20 (inclusive). 
Vinicius Corrêa Carvalho
*/

package desafio01;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número aleatório.");
		int valor = sc.nextInt();
		if (valor<10 || valor> 20) {
			System.out.println("O valor "+valor+" não está dentro do intervalo.");
		} else {
			System.out.println("O valor "+valor+" está dentro do intervalo.");
		}
		sc.close();
	}
}
