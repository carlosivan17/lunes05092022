package lunes05092022;

import java.util.Scanner;

public class Estructurawhile {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese su edad: ");
		int edad = lector.nextInt();
		
		while(edad < 20) {
			System.out.println("Edad incorrecta!\t");
			System.out.println("Ingrese su edad: ");
			edad = lector.nextInt();
			
		}
		System.out.println("Fin del programa!");

	}

}
