/*
Instituto Proa - Jailson
Escreva um programa que leia um ano e verifique se ele é bissexto. 
Um ano é bissexto se for divisível por 4, mas não por 100, exceto se for divisível por 400.  
Vinicius Corrêa Carvalho
*/

package desafio01;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um ano e verifique se ele é bissexto: ");
		int ano = sc.nextInt();
		if (((ano%4==0) && (ano%100!=0)) || (ano%400==0)) {
			System.out.println("O ano digitado é bissexto.");
		} else {
			System.out.println("O ano digitado não é bissexto.");
		}
			sc.close();
	}
}