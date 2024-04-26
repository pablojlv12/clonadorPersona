package persona;

public class PersonaData {

	public static int LIMITE_EDAD_MAX = 120;
	public static int LIMITE_EDAD_MIN = 5;
	
	public static int LIMITE_PESO_MAX = 90;
	public static int LIMITE_PESO_MIN = 20;
	
	public static float LIMITE_ALTURA_MAX = 180;
	public static float LIMITE_ALTURA_MIN = 100;
	
	/**
	 * método de verificar a la persona
	 * @param edad
	 * @param peso
	 * @param altura
	 * @throws Exception
	 */
	public void verificaPersona(int edad,int peso,float altura) throws Exception {
		if(edad<LIMITE_EDAD_MIN||edad>LIMITE_EDAD_MAX) {
			throw new Exception("edad erronea");
		}
		if(peso<LIMITE_PESO_MIN||peso>LIMITE_PESO_MAX) {
			throw new Exception("peso erroneo");
		}
		if(altura<LIMITE_ALTURA_MIN||altura>LIMITE_ALTURA_MAX) {
			throw new Exception("altura erronea");
		}
	}
	
}
