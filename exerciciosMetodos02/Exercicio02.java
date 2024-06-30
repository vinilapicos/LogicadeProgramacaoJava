package exerciciosMetodos02;
import java.util.Scanner;
//Crie um método chamado ImprimirMensagem que receba uma string como parâmetro e imprima essa mensagem na tela.
 
public class Exercicio02 {
	static void ImprimirMensagem(String mensagem) {
		System.out.println(mensagem);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma mensagem para aparecer no console.");
		String mensagem = sc.nextLine();
		ImprimirMensagem(mensagem);
		sc.close();
	}
}