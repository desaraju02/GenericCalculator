package com.nag.GenericCalculator;

import junit.framework.TestCase;

public class AppTest1 extends TestCase {

	public void testGetTempInF() {
		
		App app = new App();
		int temp = 10;
		int tempTest = app.getTempInC("10");
		
		assertTrue("Valid Test", temp == tempTest);
	}

}
