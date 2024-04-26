package persona;

public class Persona extends PersonaData {

	// atributos
	private String nombre;
	private int edad;
	private int peso;
	private float altura;

	/**
	 * constructor parametrizado
	 * 
	 * @param nombre
	 * @param edad
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre, int edad, int peso, float altura) {
		this.nombre = nombre;
		setEdad(edad);
		setPeso(peso);
		setAltura(altura);
	}

	/**
	 * getter nombre
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * setter nombre
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * getter edad
	 * 
	 * @return edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * setter edad
	 * @param edad
	 */
	public void setEdad(int edad){
		this.edad = edad;
	}

	/**
	 * getter peso
	 * @return peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * setter peso
	 * @param peso
	 */
	public void setPeso(int peso){
		this.peso = peso;
	}

	/**
	 * getter altura
	 * @return altura
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * setter altura
	 * @param altura
	 */
	public void setAltura(float altura){
		this.altura = altura;
	}

	// toString
	@Override
	public String toString() {
		return "[" + nombre + "(" + edad + "), " + peso + "/ " + altura + "]";
	}

}
