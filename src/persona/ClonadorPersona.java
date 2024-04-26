package persona;

import java.util.ArrayList;
import java.util.List;

public class ClonadorPersona {

	private String nombre;

	/**
	 * constructor parametrizado
	 * @param nombre
	 */
	public ClonadorPersona(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * método clonar a la persona
	 * @return List<Persona>
	 */
	public List<Persona> generarClones() {
		PersonaData pd = new PersonaData();
		List<Persona> devolver = new ArrayList<Persona>();
		for (int i = 0; i < 10; i++) {
			try {
				int edad = (int) (Math.random() * 100);
				int peso = (int) (Math.random() * 101);
				float altura = (float) (Math.random() * 201);

				pd.verificaPersona(edad, peso, altura);
				devolver.add(new Persona(nombre, edad, peso, altura));

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return devolver;
	}

}
