package ejercicio1;

public class Hora {
	/**
	 * Se guardará la hora
	 */
	int hora;
	/**
	 * Se guardarán los minutos
	 */
	int minuto;
	/**
	 * Se guardarán los segundos
	 */
	int segundo;

	/**
	 * Constructor sin parámetros
	 */
	public Hora() {
		super();

	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param hora
	 * @param minuto
	 * @param segundo
	 */
	public Hora(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	/**
	 * Método que devuelve el valor del atributo hora
	 * 
	 * @return
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * Método que devuelve el valor del atributo minuto
	 * 
	 * @return
	 */
	public int getMinuto() {
		return minuto;
	}

	/**
	 * Método que devuelve el valor del atributo segundo
	 * 
	 * @return
	 */
	public int getSegundo() {
		return segundo;
	}

	/**
	 * Método que modificará el valor del atributo
	 * 
	 * @param hora
	 */
	public void setHora(int hora) {
		if (hora > 0 && hora < 24) {
			this.hora = hora;
		}
	}

	public void incrementaSeg() {
		if (segundo >= 60 || segundo < 0 && minuto >= 60 || minuto < 0 && hora >= 24 || hora < 0) {
			System.out.println("Dato erróneo.");
		}
		segundo++;
		if (segundo==60) {
			segundo=0;
			minuto++;
		}
		if (minuto==60) {
			minuto=0;
			hora++;
		}
		if (hora==24) {
			hora=0;
		}

	}
}
