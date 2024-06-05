/*
Instituto Proa - Jailson
Escreva um programa que leia a nota de um aluno e converta-a para conceito: A (nota >= 9), B (7 <= nota < 9), C (5 <= nota < 7), D (3 <= nota < 5) e E (nota < 3). 
Vinicius Corrêa Carvalho
*/

package desafio01;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a nota do aluno:");
		float nota = sc.nextFloat();
		if (nota>=9) {
			System.out.println("O aluno ficou com o conceito A.");
		} else if (nota>=7){
			System.out.println("O aluno ficou com o conceito B.");
		} else if (nota>=5){
			System.out.println("O aluno ficou com o conceito C.");
		} else if (nota>=3){
			System.out.println("O aluno ficou com o conceito D.");
		} else {
			System.out.println("O aluno ficou com o conceito E.");
		}
		sc.close();
	}
}