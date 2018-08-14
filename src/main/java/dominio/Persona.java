package dominio;

import dominio.excepcion.PersonaExcepcion;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	
	public static final String LA_EDAD_ES_NEGATIVA = "La edad es negativa";

	public Persona(String nombre,String  apellido, int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String presentarPersona(){
		String mensaje = "Hola, soy " + this.nombre + " " + this.apellido + " de edad " + this.edad ;
		return mensaje;
	}

	public int calcularAnioNacimiento(int anioActual){
		
        if(this.edad < 0 ) {
        	throw new PersonaExcepcion(LA_EDAD_ES_NEGATIVA);
		}
		
		return anioActual - this.edad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
