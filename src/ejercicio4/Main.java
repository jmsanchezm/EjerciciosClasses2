package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Disco discos [] = new Disco [10]; //Creamos un array de tipo disco de tamaño 10. Se guardarán los discos
		
		int opcion = 0; //Se guaradará la opcion del menú
		int cont;
		
		//Creamos el Scanner 
		Scanner read= new Scanner (System.in);
		
		System.out.println("COLECCIÓN DE DISCOS");
		System.out.println("===================");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Disco");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
		opcion= read.nextInt();
		
		do {
			switch (opcion) {
			case 1: 
				
				
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
			
			opcion=read.nextInt();
		}while (opcion!=5);
		
		
		}
	}

}
