package exemplo;

import java.util.Scanner;

public class IfElseTernario01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor");
		int valor = sc.nextInt();
		String resultado = (valor % 2 == 0) ? "Número digitado é par" : "Número digitado é ímpar";
		System.out.println(resultado);
		sc.close();
	}

}
