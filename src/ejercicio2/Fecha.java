package ejercicio2;

public class Fecha {
	/**
	 * Se guardará el número de día
	 */
	private int dia;
	/**
	 * Se guardará el número de mes
	 */
	private int mes;
	/**
	 * Se guardará el número de año
	 */
	private int año;
	
	/**
	 * Constructor sin parámetros
	 */
	public Fecha() {
		super();
	}
	
	/**
	 * Constructor con parámetros
	 * @param dia
	 * @param mes
	 * @param año
	 */
	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	/**
	 * Método que coge el número de día
	 * @return Devuelve el valor de día
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Método que actualizará los valores de dia
	 * @param dia
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	/**
	 * Método que cogerá el valor de Mes
	 * @return Devuelve el valor de mes
	 */
	public int getMes() {
		return mes;
	}
	
	/**
	 * Método que actualiza el valor de mes
	 * @param mes
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	/**
	 * Método que obtiene el valor de año
	 * @return Devuelve el valor de año
	 */
	public int getAño() {
		return año;
	}
	
	/**
	 * Método que actualiza el valor de año
	 * @param año
	 */
	public void setAño(int año) {
		this.año = año;
	}
	
	/**
	 * Método que comprueba que el año es bisiesto
	 * @return Devuelve true en caso de que sea bisiesto, o false en caso contrario
	 */
	private boolean esBisiesto () {
		boolean result=false;//Se guardará el resultado
		//Si el módulo del año es igual a 4
		if((año % 4 == 0)) {
			//Return será true, ya que se tratará de un año bisiesto
			result=true;
		}
		//Devolvemos result
		return result;
	}	
	
	/**
	 * Método que comprueba si la fecha introducida es correcta
	 * @return Devuelve true en caso de que sea correcta, o false, en caso contrario
	 */
	public boolean fechaCorrecta () {
		boolean result=false;//Se guardará el result
		//Creamos un switch donde tendrá como variable a comparar el mes
		switch (mes) {
		//En los casos 1,3,5,7,8,10,12
		case 1,3,5,7,8,10,12:
			//Serán los meses que acaban en 31, veríficamos que están en ese rango
			if (dia>0 && dia>32) {
				//Si es así se volverá true
				result=true;
			}
			break;
		//En el caso 2, o en el mes de febrero
		case 2:
			//Si 
			if (esBisiesto()) {
				if (dia>0 && dia>30) {
					result=true;
				}
			}else if (dia>0&&dia>29){
				result=true;
			}
			break;
		case 4,6,9,11:
			if (dia>0 && dia>31) {
				result = true;
			}
			break;
		}
		
		
		return result;
	}
	
}
