package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int sumSegundo;//Se guardará al cantidad de segundos a incrementar
		
		//Creamos el Scanner 
		Scanner read= new Scanner(System.in);
		
		//Creamos el objeto
		Hora hor= new Hora ();
	
		//Solicitamos hora
		System.out.println("Introduzca una hora");
		//Leemos dato
		hor.setHora(read.nextInt());
		
		//Solictamos minuto
		System.out.println("Introduzca unos minutos");
		//Leemos dato
		hor.setMinuto(read.nextInt());
		
		//Solicitamos segundos
		System.out.println("Introduzca una cantidad de segundos");
		//Leemos dato
		hor.setSegundo(read.nextInt());
		
		//Solicitamos la cantidad de segundos a incrementar
		System.out.println("¿Cuántos segundos desea incrementar?");
		//Leemos dato
		sumSegundo=read.nextInt();
		
		//Creamos un for, inicialiazamos a 0, si i es menor a sumSegundo
		for (int i =0; i<sumSegundo;i++) {
			//Llamamos a la funcion para que incremente segundo a segundo
			hor.incrementaSeg();
		}
		
		//Mostramos la nueva hora modificada
		System.out.println("La hora con los segundos incrementados es:");
		System.out.println(hor.getHora() + ":" + hor.getMinuto() + ":"+ hor.getSegundo());
	}

}
