package exemplo;

public class ExemploRandom {

	public static void main(String[] args) {
		int cont =0;
		
		for (int i = 0; i < 1000; i++) {
			
			int valor= (int)(Math.random()*101);
			
			System.out.println(valor);
			
			cont++;
			
		}
		System.out.println("Contagem"+cont);	
	}

}
