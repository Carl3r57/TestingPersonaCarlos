package testPersona;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import persona.Persona;

class PersonaTest extends Persona {
	
	private static persona.Persona carlos;
	private static persona.Persona laila;
	private static persona.Persona pepe;

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
	
	carlos= new Persona("carlos", 18, 'H',45.0, 190.0);
	laila= new Persona("Laila", 18, 'M',58.0, 160.0);
	pepe= new Persona("Pepe", 18, 'H',91.0, 185.0);
	}

		@Test
	    void testCalcularIMC_PesoIdeal() {
		  carlos.setPeso(70.0);
		  carlos.setAltura(1.75);
	      assertNotEquals(carlos.calcularIMC(),Persona.INFRAPESO);
		  assertEquals(Persona.PESO_IDEAL, carlos.calcularIMC());
	    }

	    @Test
	    void testCalcularIMC_Infrapeso() {
	        carlos.setPeso(19.0);
	        carlos.setAltura(1.95);
	        assertNotEquals(carlos.calcularIMC(),Persona.SOBREPESO);
	        assertEquals(Persona.INFRAPESO, carlos.calcularIMC());
	    }
	    
	    
	    @Test
	    void testCalcularIMC_Sobrepeso() {
	        carlos.setPeso(120.0);
	        carlos.setAltura(1.95);
	        assertEquals(Persona.SOBREPESO, carlos.calcularIMC());
	        assertNotEquals(carlos.calcularIMC(),Persona.INFRAPESO);
	    
	    }
	    
	    
	    @Test
	    void testNoEsMayorDeEdad() {
	        laila.setEdad(15);
	        assertFalse(laila.esMayorDeEdad());
	        carlos.setEdad(17);
	        assertFalse(laila.esMayorDeEdad());
	        pepe.setEdad(4);
	        assertFalse(laila.esMayorDeEdad());
	    }
	    
	    @Test
	    void testEsMayorDeEdad1() {
	        laila.setEdad(18);
	        assertTrue(laila.esMayorDeEdad());
	        carlos.setEdad(81);
	        assertTrue(carlos .esMayorDeEdad());
	        pepe.setEdad(45);
	        assertTrue(pepe.esMayorDeEdad());
	    }
	    
	    
	    @Test
	    void testComprobarSexo_Correcto() {
	    	 pepe.setSexo('M');
	    	 assertEquals('M', pepe.getSexo());
	    	 
	    	 carlos.setSexo('H');
	    	 assertEquals('H', carlos.getSexo());
	    	 
	    	 laila.setSexo('M');
	    	 assertEquals('M', laila.getSexo());

	    }
	       
	   
	    @Test
	    void testComprobarSexo_Incorrecto() {
	    	 pepe.setSexo('M');
	    	 assertFalse('M', pepe.getSexo());
	    	 
	    	 carlos.setSexo('H');
	    	 assertF('H', carlos.getSexo());
	    	 
	    	 laila.setSexo('M');
	    	 assertEquals('M', laila.getSexo());

	    }
	    
	    
	    
	    @Test
	    void comprobarDniValido() {
	        carlos.setPeso(120.0);
	        carlos.setAltura(1.95);
	        assertEquals(Persona.SOBREPESO, carlos.calcularIMC());
	        assertNotEquals(carlos.calcularIMC(),Persona.INFRAPESO);
	    
	    }
	    

		@Test
		void testSetNombre() {
			 carlos.setNombre("Carlitos");
			 laila.setNombre("lailita");
			 pepe.setNombre("pepillo");
		}
	
		@Test
		void testSetEdad() {
			 carlos.setEdad(26);
			 laila.setEdad(54);
			 pepe.setEdad(45);
	
		}
	
		@Test
		void testSetSexo() {
			 carlos.setSexo('M');
			 laila.setSexo('H');
			 pepe.setSexo('M');
		}
	
		@Test
		void testSetPeso() {
			 carlos.setPeso(110.1);
			 laila.setPeso(69.0);
			 pepe.setPeso(67.2);
		}
	
		@Test
		void testSetAltura() {
			fail("Not yet implemented");
		}
	
	
		@Test
		void testEsMayorDeEdad() {
			fail("Not yet implemented");
		}
	
		@Test
		void testToString() {
			fail("Not yet implemented");
		}

}
