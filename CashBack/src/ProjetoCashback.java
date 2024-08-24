import java.util.Scanner;

public class ProjetoCashback {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double cashback = 0.0;

		System.out.println("Olá, Digite o seu nome: ");
		String nome = scan.nextLine();

		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();

		System.out.println("Digite o valor da compra: ");
		double valorDaCompra = scan.nextDouble();

		if (idade >= 21 && valorDaCompra < 1000) {
			cashback = valorDaCompra * 0.05;
		} else if (idade < 21 && valorDaCompra < 1000 || idade >= 21 && valorDaCompra >= 1000) {
			cashback = valorDaCompra * 0.07;
		} else if (idade >= 21 && valorDaCompra >= 1000) {
			cashback = valorDaCompra * 0.07;
		} else if (idade < 21 && valorDaCompra >= 1000) {
			cashback = valorDaCompra * 0.10;
		}

		System.out.printf("Cliente: %s%n", nome);
		System.out.printf("Idade: %d%n", idade);
		System.out.printf("Seu cashback é de: R$ %.2f%n", cashback);

		scan.close();
	}
}
