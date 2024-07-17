package repeticaofor;

public class aula01 {
	public static void main(String[] args) {
		
//		for(int i = 0 ; i<10; i++) {
//			System.out.println("OLÁ");
//		}
		int x = 0;
		int y = 100;
		for(int i = x; i < y;i++) {
			if(i % 3 == 0) {
				System.out.println("Achei um número divisivel por 19 entre x e y");
				System.out.println(i);
				//break;
			}
			
		}
	}
}
