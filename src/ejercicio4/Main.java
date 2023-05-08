package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcion = 0;
		String codigo = "LIBRE";
		String autor;
		String titulo;
		String genero;
		int duracion = 1;
		int espacio = 10;

		Disco[] discos = new Disco[10];

		Scanner read = new Scanner(System.in);

		for (int i = 0; i < discos.length; i++) {
			discos[i] = new Disco();
		}

		do {
			System.out.println("COLECCIÓN DE DISCOS");
			System.out.println("======================");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo Disco");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			opcion = read.nextInt();
			read.nextLine();

			switch (opcion) {
			case 1:
				for (int i = 0; i < discos.length; i++) {
					if (!discos[i].getCodigo().equals("LIBRE")) {
						System.out.println(discos[i].toString());
					}
				}
				break;
			case 2:
				if (espacio > 0) {
					System.out.println("Introduzca los datos del disco en el siguiente orden:");
					System.out.println("codigo-autor-titulo-genero-duracion");
					codigo = read.next();
					read.nextLine();
					autor = read.next();
					read.nextLine();
					titulo = read.nextLine();
					genero = read.nextLine();
					duracion = read.nextInt();
					read.nextLine();
					for (int i = 0; i < discos.length; i++) {
						if (discos[i].getCodigo().equals("LIBRE")) {
							discos[i].setCodigo(codigo);
							discos[i].setAutor(autor);
							discos[i].setTitulo(titulo);
							discos[i].setGenero(genero);
							discos[i].setDuracion(duracion);
							espacio--;
						}
					}
				} else {
					System.out.println("No queda espacio");
				}
				break;
			case 3:
				System.out.println("Introduzca el codigo del disco a desear");
				codigo = read.next();
				read.nextLine();
				for (int i = 0; i < discos.length; i++) {
					if (discos[i].getCodigo().equals(codigo)) {
						System.out.println("Introduzca los nuevos datos del disco");
						autor = read.next();
						read.nextLine();
						titulo = read.nextLine();
						genero = read.nextLine();
						duracion = read.nextInt();
						read.nextLine();
						discos[i].setAutor(autor);
						discos[i].setTitulo(titulo);
						discos[i].setGenero(genero);
						discos[i].setDuracion(duracion);
					}
				}
				break;
			case 4:
				if(espacio<=10) {
				System.out.println("Introduzca el codigo del disco a eliminar:");
				codigo = read.next();
				read.nextLine();
				for (int i = 0; i < discos.length; i++) {
					if (discos[i].getCodigo().equals(codigo)) {
						discos[i].setCodigo("LIBRE");
						espacio++;
					}
				}
				}else {
					System.out.println("No hay discos a eliminar");
				}
				break;
			case 5:
				System.out.println("Has salido del programa");
				break;
			default:
				System.out.println("Seleccione una opcion correcta");
			}

		} while (opcion != 5);

		read.close();
	}

}
