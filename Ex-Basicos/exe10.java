package aula_01;

import java.util.Scanner;
public class exe10 {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		System.out.println("Digite um valor");
		double valor = numero.nextDouble();
		System.out.println(valor);
		
		if(valor < 0) {
			System.out.println("Número Negativo");
		}else {
			System.out.println("Número Positivo");
		}
	}
}
