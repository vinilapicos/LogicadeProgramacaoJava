/*
Instituto Proa - Jailson
Escreva um programa que leia três notas de um aluno e calcule a média. 
Informe se o aluno está aprovado (média >= 7), em recuperação (5 <= média < 7) ou reprovado (média < 5). 
Vinicius Corrêa Carvalho
*/

package desafio01;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota do aluno:");
		float nota1 = sc.nextFloat();
		System.out.println("Digite a segunda nota do aluno:");
		float nota2 = sc.nextFloat();
		System.out.println("Digite a terceira nota do aluno:");
		float nota3 = sc.nextFloat();
		float media = (nota1+nota2+nota3)/3;
		if (media >= 7) {
			System.out.println("O aluno está aprovado com a média: " + media);
		} else if(media >= 5) {
			System.out.println("O aluno está de recuperação com a média: " + media);
		} else {
			System.out.println("O aluno está reprovado com a média: " + media);
		}
		sc.close();
	}
}