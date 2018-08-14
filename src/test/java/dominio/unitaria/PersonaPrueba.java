package dominio.unitaria;

import org.junit.Test;
import dominio.Persona;
import dominio.excepcion.PersonaExcepcion;

import static org.junit.Assert.*;

public class PersonaPrueba {
	
	@Test
	public void puedoContruirPersona(){
		// arrange
		Persona persona = new Persona("Alex","Garcia",35);
		
		//assert
		assertEquals("Alex",persona.getNombre());
		assertEquals("Garcia",persona.getApellido());
		assertEquals(35,persona.getEdad());
	}
	
	@Test
	public void puedoPresentarPersona(){
		//arrange
		
		String presentacionDeControl = "Hola, soy Alex Garcia de edad 35";
		Persona persona = new Persona("Alex","Garcia",35);
		
		//assert
		assertEquals(presentacionDeControl,persona.presentarPersona());
	}
	
	@Test
	public void puedoCalcularAnioNacimientoConEdadIngresadaPositiva(){
		//arrange
		Persona persona = new Persona("Alex","Garcia",35);
		int anioActual = 2018;
		int anionacimientoControl =0;
		int anioNacimientoObtenido = 0;
		
		//act
		anionacimientoControl = anioActual - persona.getEdad();
		anioNacimientoObtenido = persona.calcularAnioNacimiento(anioActual);
		
		//assert
		assertEquals(anionacimientoControl,anioNacimientoObtenido);
	}

	@Test
	public void noPuedoCalcularAnioNacimientoConEdadIngresadaNegativa(){
		//arrange
				Persona persona = new Persona("Alex","Garcia",-35);
				int anioActual = 2018;
				int anionacimientoControl =0;
				
				//act
				anionacimientoControl = anioActual - persona.getEdad();
				try {
					int anioNacimientoObtenido = 0;
					anioNacimientoObtenido = persona.calcularAnioNacimiento(anioActual);
				}
				catch (PersonaExcepcion e){
					assertEquals(e.getMessage(),Persona.LA_EDAD_ES_NEGATIVA);
				}
		
	}
	
}
