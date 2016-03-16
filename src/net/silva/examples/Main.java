package net.silva.examples;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hola Mundo para Git");
		System.out.println("Dime un numero: ");
		Scanner key = new Scanner(System.in);
		
		int numero = key.nextInt();
		key.close();
		System.out.println("Tu numero: " + Integer.toString(numero));
		
		
		//This is a tests con mocos
	}

}
