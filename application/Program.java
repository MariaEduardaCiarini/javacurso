<<<<<<< HEAD
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;
=======
package application;import java.util.Locale;
import java.util.Scanner;

import entities.Product;
>>>>>>> 4a77550 (Orientação a Objetos)

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		
		
		System.out.println("Enter the measures of triangle X:	");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y:	");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Large area: Y");
		}

		sc.close();
=======

		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();

		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.print("Enter the number of  products to be added in stock:	");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Update data: " + product);

		System.out.println();
		System.out.print("Enter the number of  products to be removed from stock:	");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Product data: " + product);
		sc.close();

>>>>>>> 4a77550 (Orientação a Objetos)
	}

}
