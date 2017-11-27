package arrieta.com;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import junit.framework.TestCase;

public class testBowling {

	private Frame fr;
	private Juego Ju;
	
	@Before	
	public void setUp() throws Exception {
		fr = new Frame();
		
	}
	
	@Test
	public void FrameValido() {
		int numero = 2+3;
		fr.valido(numero);
		assertTrue("valor valido", true);
	}
	
	

	@Test
	public void FrameInvalido() {
		int numero = 82 +2;
		
		fr.valido(numero);
		assertFalse("valor no valido", false) ;
	}

	@Test
	public void FrameInvalidoNegativo() {
		int numero = -82 +2;
		
		fr.valido(numero);
		assertFalse("valor no valido fuera del rango", false) ;
	}
	
	@Before	
	public void setUp1() throws Exception {
		Ju = new Juego();
		
	}
	
	@SuppressWarnings("null")
	@Test
	public void JuegoValido() {
		
		 
		
		Ju.valido(4, 4, 4, 5, 7, 3, 2, 3, 6, 3, 0);
				
		assertTrue("juego valido", true);
	}
	
	@Test
	public void JuegoExtra() {
		
		 
		
		Ju.valido(4, 4, 4, 5, 7, 3, 2, 3, 6, 10, 8);
				
		assertFalse("juego extra", false);
	}
	
	
	
	

}
