package udemy.devsuperior.poo.exemplo;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the measures of triangle X:");
		xA = scanner.nextDouble();
		xB = scanner.nextDouble();
		xC = scanner.nextDouble();
		
		double pX = xA + xB + xC / 2;
		double areaX = pX * (pX - xA) * (pX - xB) * (pX - xC);
		
		System.out.println("Enter the measures of triangle Y:");
		yA = scanner.nextDouble();
		yB = scanner.nextDouble();
		yC = scanner.nextDouble();
		
		double pY = yA + yB + yC / 2;
		double areaY = pX * (pX - yA) * (pX - yB) * (pX - yC);
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		scanner.close();
		
	}

}
