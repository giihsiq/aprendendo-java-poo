package udemy.devsuperior.poo.exemplo;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Products products = new Products();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		products.name = scanner.nextLine();
		
		System.out.print("Price: ");
		products.price = scanner.nextDouble();
		
		System.out.print("Quantity: ");
		products.quantity = scanner.nextInt();
		
		System.out.println();
		System.out.println("Products data " + products);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = scanner.nextInt();
		products.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data " + products);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = scanner.nextInt();
		products.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Udapted data " + products);
		
		scanner.close();
		
	}

}
