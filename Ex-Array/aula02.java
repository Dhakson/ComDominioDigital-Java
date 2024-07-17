package AulasDeArray;

public class aula02 {
	public static void main(String[] args) {
		int [] b = {12,3,5,68,9,6,73,44,456,65,321};
		int [] a = {43,42,4,8,55,21,2,45};
		
		if(a.length > 8) {
			System.out.println("Tamanho do Array A - maior que 8");
		}else {
			System.out.println("Tamanho do Array A - menor que 8");
		}
		System.out.println("\nTamanho do Array B = "+b.length);
}
}
