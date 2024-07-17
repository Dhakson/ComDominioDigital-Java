package aula_01;

import java.util.Scanner;
public class exe12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int valor = entrada.nextInt();
		
		if(valor == 1) {
			 System.out.println("Segunda - Feira");
		}
		else if(valor == 2) {
			 System.out.println("Terça-Feira");
		}else if (valor == 3) {
			 System.out.println("Quarta-Feira");
		}else if (valor == 4) {
			 System.out.println("Quinta-Feira");
		}else if (valor == 5) {
			 System.out.println("Sexta-Feira");
		}else if (valor == 6) {
			 System.out.println("Sábado");
		}else if(valor == 7) {
			System.out.println("Domingo");
		}else {
			System.out.println("Número invlido.");
		}
	}

}
