package whille;
import java.util.ArrayList;

public class aula03 {
	public static void main(String[] args) {
		int i = 0;
	
		
		while(i <= 100) {
			if( i % 2 !=0) {
				int impares = i;
				System.out.printf(" %d ",impares);
			}
			i++;
		}
		int ii = 1;
		System.out.println(" ");
		while (ii <= 100) {
			if(ii % 2 == 0) {
				int pares = ii;
				
				System.out.printf(" %d ",pares);
			}
			ii ++;
		}
	}
}
