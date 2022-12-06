package exemplo;

public class ExemploJavaMath {

	public static void main(String[] args) {
		
		int numero=25;
		
		int numero1=11;
		
		System.out.println(Math.max(numero, numero1));
		System.out.println(Math.min(numero, numero1));
		System.out.println(Math.sqrt(numero));
		int subtracao = numero1-numero;
		System.out.println("Subtração :"+subtracao);
		System.out.println(Math.abs(subtracao));
		System.out.println(Math.random());
		//
		int valor=(int)((Math.random())*1001);
		
		System.out.println(valor);
		
		
		
		
		
		
	}
}
