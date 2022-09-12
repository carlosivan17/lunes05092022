package lunes05092022;

import java.util.Scanner;

public class Adivinanza {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		long num = Math.round(Math.random() * 10);
		System.out.println("Adivine un numero entre 0 y 10 : ");
		int resp= lector.nextInt();
		
		while(num != resp) {
			System.out.println("Lo siento. Numero incorrecto. Vuelve a intentarlo");
			System.out.println("Adivine un numero entre 0 y 10 : ");
			resp = lector.nextInt();
		}
		System.out.println("Felicidades, adivinaste. El numero es " + num);
		System.out.println("Fin del juego");

	}

}
