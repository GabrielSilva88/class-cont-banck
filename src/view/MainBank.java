package view;

import java.util.Scanner;

import model.ContaBancaria;

public class MainBank {
	/*
	 * Classe Conta Bancária: Crie uma classe ContaBancaria com os atributos
	 * numero, saldo e titular. Encapsule os atributos para garantir que apenas
	 * métodos da classe possam modificá-los.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ContaBancaria cb = new ContaBancaria();
		
		cb.setNumero(1);
		cb.setTitular("Gabriel");
		cb.setSaldo(1000.00);

		System.out.println("Dados das Contas:\nNome: " + cb.getTitular() + "\nNúmero: "+ cb.getNumero()+"\nSaldo: "+cb.getSaldo());
		
		System.out.println("Digite Nome: ");
		cb.setTitular(scan.nextLine());
		
		System.out.println("Digite Numero: ");
		cb.setNumero(scan.nextInt());
		
		System.out.println("Digite Saldo: ");
		cb.setSaldo(scan.nextDouble());
		
		System.out.println("Dados das Contas:\nNome: " + cb.getTitular() + "\nNúmero: "+ cb.getNumero()+"\nSaldo: "+cb.getSaldo());
	}
}
