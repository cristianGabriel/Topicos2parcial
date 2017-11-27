package arrieta.com;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import junit.framework.TestCase;

public class testBowling {

	private Frame fr;
	
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
	
	@Test
	public void FrameInvalidoDistintosArgumentos() {
		String numero = "82" + "a";
		
		fr.valido(numero);
		assertFalse("valor no valido", false) ;
	}

}
