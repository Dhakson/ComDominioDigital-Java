package aula_01;
import java.util.Scanner;
public class exe13 {
	public static void main(String[] args) {
		double media = 0;
		Scanner nota = new Scanner(System.in);
		
		System.out.println("Digite a primeira Nota");
		double valor = nota.nextDouble();
		
		System.out.println("Digite a segunda Nota");
		double valor2 = nota.nextDouble();
		
		media = (valor + valor2) / 2;
		
		if(media >= 7) {
			System.out.printf("Aluno Aprovado com a média : %.2f", media);
		}
		
		else if(media >= 4) {
			System.out.printf("Aluno em Recuperação com a média : %.2f " , media);
		}
		
		else {
			System.out.printf("Aluno Reprovado com a média : %.2f", media);
		}
	}

}
