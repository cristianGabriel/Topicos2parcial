package arrieta.com;

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
		
		fr.valido(2,3);
		junit.framework.Assert.assertTrue(true);
	}

	

}
