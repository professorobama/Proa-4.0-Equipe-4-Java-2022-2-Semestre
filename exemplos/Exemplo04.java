package exemplo;

import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número :");
		float valor = sc.nextFloat();
		System.out.println("Digite um número :");
		float valor2 = sc.nextFloat();
		float soma = valor+valor2;
		System.out.printf("O valor total da soma é : %.2f \n" , soma);
		
		if (soma>10) {
			System.out.println("Número é maior que 10");
		}else {
			System.out.println("Número é menor que 10");
		}
		
		sc.close();
		
	}

}
