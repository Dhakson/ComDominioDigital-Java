package AulasDeArray;

public class aula06 {
	public static void main(String[] args) {
		int [] num = {20,17,22,18,36,57,80};
//		int tamanho = num.length;
//		System.out.println("Array Normal");
//		for(int a = 6 ; a >= 0;--a) {
//			System.out.printf(" %s ",num[a]);
//		}
//		
//		System.out.println(" ");
//		System.out.println("Array Reverso");
//		for(int c = 0 ; c < tamanho ;++c) {
//			System.out.printf(" %s ",num[c]);
//			
//		}
//		
//		System.out.println("\nArray Crescente");
//		for (int x = 0; x < tamanho; x++) {
//			for(int j = 0; j < tamanho - 1 - x;j++ ) {
//				if(num[j]>num[j+1]) {
//					int crescente = num[j];
//					num[j] = num[j+1];
//					num[j+1] = crescente;
//				}
//			}
//
//		}
//		for(int z = 0 ; z< tamanho; z++) {
//			System.out.printf(" %d ",num[z]);
//		}
		for(int a = 0; a < 7;a++) {
			System.out.println(num[6-a]);
	}
}
}