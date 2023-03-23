package ejercicio3;

public class Main {

	public static void main(String[] args) {
		Fecha fecha = new Fecha (31,12,2004);
		fecha.fechaCorrecta();
		fecha.diaSiguiente();
		System.out.println(fecha.toString());
	}

}
