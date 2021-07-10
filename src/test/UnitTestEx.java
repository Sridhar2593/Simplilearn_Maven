package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestEx extends PrimeNumberChk{

	
	@Test
	public void PositiveTest()	{
		Assert.assertTrue(PrimeNumberChk.isPrime(13));
	}
	
	@Test
	public void NegativeTest() {
		Assert.assertFalse(PrimeNumberChk.isPrime(10));
	}
}
