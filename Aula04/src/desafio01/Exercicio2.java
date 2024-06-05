/*
Instituto Proa - Jailson
Escreva um programa que leia um número inteiro e informe se ele é positivo, negativo ou zero. 
Vinicius Corrêa Carvalho
*/

package desafio01;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro aleatório:");
		int valor = sc.nextInt();
		String resultado = (valor > 0) ? "O número é positivo." : (valor == 0) ? "O número é igual a zero." : "O número é negativo.";
		System.out.println(resultado);
		sc.close();
	}
}