package ejercicio4;

public class Disco {
	private String codigo = "LIBRE";
	private String autor;
	private String titulo;
	private String genero;
	private int duracion = 1;

	/**
	 * Constructor por defecto
	 */
	public Disco() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param codigo
	 * @param autor
	 * @param titulo
	 * @param genero
	 * @param duracion
	 */
	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
		super();
		if (codigo != " ") {
			this.codigo = codigo;
		}
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
	}

	/**
	 * Constructor copia
	 * 
	 * @param disco
	 */
	public Disco(Disco disco) {
		super();
		if (codigo != " ") {
			this.codigo = disco.codigo;
		}
		this.autor = disco.autor;
		this.titulo = disco.titulo;
		this.genero = disco.genero;
		if (disco.duracion > 0) {
			this.duracion = disco.duracion;
		}
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Disco\nCodigo= " + codigo + "\nAutor= " + autor + "\nTitulo= " + titulo + "\nGenero= " + genero
				+ "\nDuracion=" + duracion +"\n";
	}

	
}
