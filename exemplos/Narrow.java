package exemplo;

public class Narrow {

	public static void main(String[] args) {
		float numero = 130.99f;
		int numero1 = (int)numero;
		
		System.out.println(numero);
		System.out.println(numero1);
		System.out.println(Math.round(numero));
		
		System.out.println("------------");
		
		//byte -128 até 127
		//-128,-127,-126
		
		int a=140;  
		byte b=(byte)a;  
		System.out.println(a);  
		System.out.println(b);  

	}

}
