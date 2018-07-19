package TestPaintWizard;

import static org.junit.Assert.*;

import org.junit.Test;

import paintWizard.Logic;

public class TestLogic {
	
	@Test
	public void TestCalculateBestCoverage() 
	{
		Logic log = new Logic();
		assertEquals("didnt return the best vlaue",	log.calculateBestCoverage(50),"DuluxourousPaints"); //Haven't dealt with if the best coverage is the same 
	}

	@Test 
	public void TestClaculateRemaningCost() 
	{
		Logic log = new Logic();
		assertEquals("The price was not calculated corectly ", log.calculatePrice(50),);
	}
}
