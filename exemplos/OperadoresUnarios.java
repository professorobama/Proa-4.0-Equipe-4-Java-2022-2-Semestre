package exemplo;

public class OperadoresUnarios {

	public static void main(String[] args) {
		int numero = 32;
		int numero1 = 17;
		int numero2 =19;
		System.out.println(++numero + numero1++);
		System.out.println(numero+numero1);
		System.out.println(numero++ + numero1++);
		System.out.println(numero+numero1);
System.out.println(numero++ + ++numero1 + ++numero2);
System.out.println(--numero + --numero2 + numero1--);
	}

}
