package exerciciosMetodos02;
import java.util.Scanner;
//Crie um método chamado Somar que receba dois inteiros como parâmetros e retorne a soma desses dois números.
 
public class Exercicio03 {
	static int Soma(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor a ser somado:");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor a ser somado:");
		int valor2 = sc.nextInt();
		System.out.println("A soma do valor "+valor1+" com o valor "+valor2+" é "+Soma(valor1, valor2));
		sc.close();
	}
}