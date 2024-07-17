package AulasDeArray;

import java.lang.reflect.Array;
import java.util.Scanner;

public class aula04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a;
		int [] arrayUm = new int[3];
		int [] arrayDois = new int[10];
		int [] arrayTres = new int[10];
		int [] arrayQuatro = new int[10];
		
		System.out.println("Qual é o Array que você quer preencher primeiro");
		a = entrada.nextInt();
		
		// # Aarray 1
		if(a == 1) {
			for(int i = 0; i < arrayUm.length; i ++) {
			System.out.println("Digite o Número "+ (i) +"Na posição do Array ");
			arrayUm[i] = entrada.nextInt();
			
		}
			for(int c : arrayUm)
				System.out.println(c);
			
			// # Aarray 2
		}if(a == 2) {
			for(int i = 0; i < arrayDois.length; i++) {
				System.out.println("Digite o Número " +(i) + "Na Posição do Array");
				arrayDois[i] = entrada.nextInt();
		}
			
			for(int c : arrayDois)
				System.out.println(c);
			
			// # Aarray 3
	}if (a == 3) {
		for(int i = 0; i < arrayTres.length;i++) {
			System.out.println("Digite os números do Array 3 " + (i+1));
			arrayTres[i] = entrada.nextInt();
			
		}
		for(int c : arrayTres)
			System.out.println(c);
		
		// # Aarray 4
	}if(a == 4) {
		for(int i = a; i < arrayQuatro.length;i++) {
			System.out.println("Digite os número do Array 4" +(i+1));
			arrayQuatro[i] = entrada.nextInt();
		}
		for(int c : arrayQuatro)
			System.out.println(c);
		entrada.close();
	}
		
}
}