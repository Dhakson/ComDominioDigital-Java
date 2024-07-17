package whille;
import java.util.Scanner;
public class aula02 {
	public static void main(String[] args) {
		int sala = 0;
		float soma = 0;
		double media = 0;
		double nota;
		int qntd_alunos;
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Quantidade de alunos na sala de aula");
		qntd_alunos = entrada.nextInt();
		
		System.out.println("");
		
		while(qntd_alunos > sala) {
			
			System.out.println((sala+1)+"ª Nota");
			nota = entrada.nextDouble();
			soma += nota;
			sala++;
		}
		media = soma / qntd_alunos;
		System.out.printf("A Soma total das notas da clase é: %s ",soma);
		System.out.printf("\nA Média da Classe é: %.2f",media);
	}

}
