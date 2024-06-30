package exerciciosMetodos02;
 
import java.util.Scanner;
 
//Crie um método chamado Multiplicar que receba dois inteiros como parâmetros e retorne o produto desses dois números.
 
public class Exercicio04 {
	static int Mult(int a, int b) {
		return a*b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor a ser multiplicado:");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor a ser multiplicado:");
		int valor2 = sc.nextInt();
		System.out.println("A multiplicação do valor "+valor1+" com o valor "+valor2+" é "+Mult(valor1, valor2));
		sc.close();
	}
}