package application;

import java.util.Locale;
import java.util.Scanner;

import obj.ProductOvercharg;

public class prodSobrecarga {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();// cria variável temporaria que dá valor ás variáveis presentes no construtor
		System.out.print("Price: ");
		double price = sc.nextDouble();
		

		System.out.print("How many products are in stock? ");
		double init = sc.nextDouble();
		ProductOvercharg produto = new ProductOvercharg(name, price, init);
		System.out.println("Product Data: " + produto);
		 //insere a variavel para ela agir no objeto
		System.out.print("Do you want to add an item from stock? Press S/N ");
		char resp1 = sc.next().charAt(0);
		if (resp1 == 'S') {
			System.out.println();
			System.out.print("Enter the number of products to be add in stock: ");
			int quantity1 = sc.nextInt();
			produto.addProducts(quantity1);// insere a variavel para ela agir no objeto
		} else if (resp1 == 'N') {
			System.out.println("OK");
		}else {
			System.out.println("Invalid command");
		}

		System.out.println();
		System.out.println("Updated Data: " + produto);
		System.out.println();
		System.out.print("Do you want to remove an item from stock? Press S/N ");
		char resp = sc.next().charAt(0);
		if (resp == 'S') {
			System.out.println("Enter the number of products to be removed from stock: ");
			int quantity2 = sc.nextInt();
			produto.removeProduct(quantity2);

			System.out.println();
			System.out.println("Updated Data: " + produto);

		} else if (resp == 'N') {
			System.out.println("Finished");
		} else {
			System.out.println("Invalid command");
		}
System.out.println("FINISHED");
		sc.close();
	}

}
