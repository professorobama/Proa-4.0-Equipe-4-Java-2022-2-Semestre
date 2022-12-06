package exemplo;

import java.util.Scanner;

public class Exemplo05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a sua idade :");

		int idade = sc.nextInt();
		if (idade < 16) {
			System.out.println("Não pode votar");
		} else if (idade < 18 || idade > 65) {
			System.out.println("Voto opcional");
		} else {
			System.out.println("Voto obrigatório");
		}

	}

}
