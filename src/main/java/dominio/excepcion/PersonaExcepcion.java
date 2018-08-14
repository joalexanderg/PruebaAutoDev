package dominio.excepcion;

public class PersonaExcepcion extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public PersonaExcepcion(String message) {
		super(message);
	}

}
