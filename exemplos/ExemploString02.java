package exemplo;

public class ExemploString02 {

	public static void main(String[] args) {
		
		int numero01= 10;
		int numero02= 20;
		
		int soma=numero01+numero02;
		System.out.println("Soma :"+soma);
		
		String numero03 ="10";
		String numero04 ="10";
		String soma01=numero03+numero04;
		System.out.println("Soma :"+soma01);
		
		String soma02 = numero01+numero03;
		
		System.out.println("Soma :"+ soma02);
		
		String txt = "We are the \nso-called \"Vikings\" from the north.";
		
	System.out.println(txt);
	}

}
