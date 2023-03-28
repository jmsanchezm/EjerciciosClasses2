package ejercicio2;

public class Contador {

	/**
	 * Se guardará la cantidad a contar
	 */
	private int cont;

	/**
	 * Constructor por defecto
	 */
	public Contador() {
		super();

	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param cont
	 */
	public Contador(int cont) {
		super();
		if (cont < 0) {
			this.cont = cont;
		} else {
			this.cont = 0;
		}
	}

	/**
	 * Constructor copia
	 * 
	 * @param contador
	 */
	public Contador(Contador contador) {
		this.cont = contador.cont;
	}

	/**
	 * Getter que obtendrá la cantidad de valor
	 * 
	 * @return Devolverá la cantidad de valor
	 */
	public int getCont() {
		return cont;
	}

	/**
	 * Setter que actualizará el valor a cont
	 * 
	 * @param cont
	 */
	public void setCont(int cont) {
		this.cont = cont;
	}

	/**
	 * Método que incrementará en uno al contador
	 * @param hasta
	 */
	public void incrementar(int hasta) {
		cont++;
	}

	/**
	 * Método que decrementará en uno al contador
	 */
	public void decrementar() {
		cont--;
		if (cont<=0) {
			cont=0;
		}
	}
	
	/**
	 * Método que mostrará en cuanto está el contador
	 */
	public String toString () {
		String result;
		result ="El contador está en "+ cont;
		return result;
	}
}
