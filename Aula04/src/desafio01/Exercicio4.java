/*
Instituto Proa - Jailson
Escreva um programa que leia três lados de um triângulo e verifique se eles formam um triângulo válido.
Vinicius Corrêa Carvalho
*/

package desafio01;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro lado do triângulo");
		float lado1 = sc.nextFloat();
		System.out.println("Digite o segundo lado do triângulo");
		float lado2 = sc.nextFloat();
		System.out.println("Digite o terceiro lado do triângulo");
		float lado3 = sc.nextFloat();
		if((lado1 > (lado2+lado3)) || (lado2 > (lado1+lado3)) || (lado3 > (lado2+lado1))) {
			System.out.println("Não é possível formar um triângulo válido com esses valores.");
		} else {
			System.out.println("É possível formar um triângulo.");
		}
		sc.close();
	}
}