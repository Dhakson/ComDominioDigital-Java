package aula_01;
import java.util.Scanner;


public class scannerEntrada {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número");
		double resp = entrada.nextDouble();
		System.out.println(resp);
		if (resp > 0) {
			System.out.println("É Número digitado é Positivo");
		}else {
			System.out.println("O Número digitado é Negativo");
		}
	}
}
