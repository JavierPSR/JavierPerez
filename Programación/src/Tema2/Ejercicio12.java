package Tema2;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa el tamaño del tablero: ");
		Integer n = sc.nextInt();

		if (n <= 0) {
			System.out.println("El tamaño debe ser mayor que cero.");
		} else {

			for (int i = 0; i < n; i++) {

				for (int j = 0; j < n; j++) {
					System.out.print(" __");
				}
				System.out.println();

				for (int j = 0; j < n; j++) {
					System.out.print("|__");
				}
				System.out.println("|");

				sc.close();

			}
		}
	}
}