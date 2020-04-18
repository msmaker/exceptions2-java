package application;

import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Entre com os dados da conta");
			System.out.print("Numero: ");
			int numero = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Saldo atual: ");
			double saldo = sc.nextDouble();
			System.out.print("Limite de saque: ");
			double saqueLimite = sc.nextDouble();

			Account cc = new Account(numero, nome, saldo, saqueLimite);

			System.out.println();
			System.out.print("Entre com o valor a ser sacado: ");
			cc.saque(sc.nextDouble());
			System.out.print("Saldo atual: R$" + cc.getSaldo());

		} catch (RuntimeException e) {
			System.out.println("Erro de saque: " + e.getMessage());
		}

	}

}
