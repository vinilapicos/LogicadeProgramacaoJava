/*
Instituto Proa - Jailson
Escreva um programa que leia a idade de uma pessoa e informe se ela é uma criança (0-12 anos), 
adolescente (13-17 anos), adulto (18-59 anos) ou idoso (60 anos ou mais). 
Vinicius Corrêa Carvalho
*/

package desafio01;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a idade de uma pessoa:");
		int idade = sc.nextInt();
		if (idade>=60) {
			System.out.println("A pessoa é um(a) idoso(a).");
		} else if (idade>=18){
			System.out.println("A pessoa é um(a) adulto(a).");
		} else if (idade>=13){
			System.out.println("A pessoa é um(a) adolescente.");
		} else if (idade>=0){
			System.out.println("A pessoa é uma criança.");
		} else {
			System.out.println("Idade inválida");
		}
		sc.close();
	}
}
