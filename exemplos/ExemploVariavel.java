package exemplo;

public class ExemploVariavel {

	public static void main(String[] args) {
		//instância da variável
		int numero= 50;
		System.out.println(numero);
		soma();
		System.out.println(algarismo);
		
	}
	
	public static void soma() {
		int valor=10;
		int valor1=20;
		int soma=valor+valor1;
		//variável local
		System.out.println(soma);
		System.out.println(algarismo);
	}
	
	static int algarismo= 200;
	

}
