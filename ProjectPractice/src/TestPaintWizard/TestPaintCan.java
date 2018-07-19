package TestPaintWizard;

import static org.junit.Assert.*;

import org.junit.Test;

import paintWizard.PaintCan;

public class TestPaintCan {

	@Test
	public void testCalculateTotalCoverage()  
	{
		PaintCan pc = new PaintCan("CheapoMax",20,10,1999);
		pc.calculateTotalCoverage();
		assertEquals("The total calculation wasn't",pc.getTotalCoveragePerProduct(),200);
		
	}
}
