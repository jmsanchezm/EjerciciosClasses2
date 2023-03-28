package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int incr; //Se guardrá el valor del incremento
		int decr; //Se guardará el valor del decremento
		
		//Creamos el Scanner 
		Scanner read= new Scanner (System.in);
		//Creamos el objeto con un valor de 6
		Contador cont = new Contador (6);
		
		//Solitamos cuanto desea incrementar
		System.out.println("¿Cuánto desea incrementar?");
		//Leemos dato 
		incr=read.nextInt();
		//Solicitamos cuanto desea decrementar
		System.out.println("¿Cuánto desea decrementar?");
		//Leemos dato
		decr=read.nextInt();

	
		
	}

}
