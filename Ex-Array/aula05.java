package AulasDeArray;

import java.util.Scanner;

public class aula05 {
	public static void main(String[] args) {
		double [] ArrayNotas = new double [3];
		Scanner entrada = new Scanner(System.in);
		double soma = 0;
		double media;

		
		for(int i = 0; i < ArrayNotas.length;i++) {
			System.out.println("Digite " +(i+1) + "ª Nota ");
			ArrayNotas[i] = entrada.nextDouble();
			soma += ArrayNotas[i];
			
		}
		
		for (double notas :ArrayNotas )
			System.out.println(notas);
		
		media = soma / ArrayNotas.length;
		System.out.println(" ");
		System.out.println("A soma das Notas");
		System.out.println(soma);
		System.out.println(" ");
		
		System.out.println("Média da Classe");
		System.out.printf("%s",media);
		
		for(int acima = 0 ; acima < ArrayNotas.length;acima++) {
			if(ArrayNotas[acima] > media)
				System.out.println();
			
		}

	}

}
