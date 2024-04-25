package persona;

import java.util.ArrayList;
import java.util.List;

public class ClonadorPersona {

	private String nombre;

	public ClonadorPersona(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Persona>clonar(){
		
		List<Persona>devolver = new ArrayList<Persona>();
		for(int i = 0;i<10;i++) {
		try {
			devolver.add(new Persona(this.nombre,45,64,65));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			
		}
		return devolver;
	}
	
}
