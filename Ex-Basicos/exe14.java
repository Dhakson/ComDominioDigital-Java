package aula_01;
import java.util.Scanner;
public class exe14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char Sexo;
		String Nome;
		
		
		
		System.out.println("Digite seu nome ");
		Nome = entrada.nextLine();
		System.out.println("Digite F ou M");
		Sexo = entrada.next().charAt(0);
		
		
		
		if(Sexo == 'M' || Sexo == 'm') {
			System.out.printf("Olá, %s você é do Sexo ",Nome);
		}else if(Sexo == 'F' || Sexo == 'f') {
			System.out.printf("Olá, %s você é do Sexo ",Nome);
		}else {
			System.out.printf("Sexo Invalido");
		}
		System.out.println(Sexo == 'm' ? "Masculino": "Feminino");
		
	}

}
