/*
Instituto Proa - Jailson Costa

Escreva um programa que leia o peso e a altura de uma pessoa, calcule o IMC e informe a categoria: 
Abaixo do peso: IMC < 18.5 
Peso normal: 18.5 <= IMC < 24.9 
Sobrepeso: 25 <= IMC < 29.9 
Obesidade grau I: 30 <= IMC < 34.9 
Obesidade grau II: 35 <= IMC < 39.9 
Obesidade grau III: IMC >= 40

Vinicius Corrêa Carvalho
*/

package desafio01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o peso da pessoa: ");
		float peso = sc.nextFloat();
		System.out.println("Digite a altura da pessoa: ");
		float altura = sc.nextFloat();
		double imc = peso/(Math.pow(altura, 2));
		
		DecimalFormat df = new DecimalFormat("##.##");
		
		if (imc<18.5) {
			System.out.println("Seu IMC é: " + df.format(imc) + " e você está abaixo do peso." );
		} else if (imc<24.9) {
			System.out.println("Seu IMC é: " + df.format(imc) + " e você está com o peso normal." );
		} else if (imc<29.9) {
			System.out.println("Seu IMC é: " + df.format(imc) + " e você está com sobrepeso." );
		} else if (imc<34.9) {
			System.out.println("Seu IMC é: " + df.format(imc) + " e você está com Obesidade grau I." );
		} else if (imc<39.9) {
			System.out.println("Seu IMC é: " + df.format(imc) + " e você está com Obesidade grau II." );
		} else {
			System.out.println("Seu IMC é: " + df.format(imc) + " e você está com Obesidade grau III." );
		}
		sc.close();
	}
}