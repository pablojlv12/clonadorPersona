package main;

import persona.ClonadorPersona;

public class Start {

	public static void main(String[] args) {
		
		ClonadorPersona cp = new ClonadorPersona("Pablo");
		
		System.out.println(cp.generarClones());
		
	}

}
