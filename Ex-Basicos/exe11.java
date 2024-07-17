package aula_01;
import java.util.Scanner;
public class exe11 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int valor = entrada.nextInt();
		
		System.out.println("Digite outro Número");
		int valor1 = entrada.nextInt();
		
		System.out.println("Digite um outro número");
		int valor2 = entrada.nextInt();
		
		if (valor >  valor1 && valor > valor2) {
			System.out.println("O primeiro valor é maior");
		}
		else if(valor1 > valor && valor1 > valor2){
			System.out.println("O segundo valor é maior");
		}else {
			System.out.println("O terceiro valor é maior");
		}
	}
}
