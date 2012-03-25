import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;



public class PrimeNumbersTest {
	@Test
	public void testJUnit() {
		assertTrue("The compiler isn't feeling well today...", true);
	}
	
	@Test
	public void testOne() {
		assertEquals(list(), PrimeNumbers.generatePrimes(1));
	}
	
	@Test
	public void testTwo() {
		assertEquals(list(2), PrimeNumbers.generatePrimes(2));
	}
	
	@Test
	public void testThree() {
		assertEquals(list(3), PrimeNumbers.generatePrimes(3));
	}
	
	@Test
	public void testFour() {
		assertEquals(list (2, 2), PrimeNumbers.generatePrimes(4));
	}
	
	@Test
	public void testSix() {
		assertEquals(list (2, 3), PrimeNumbers.generatePrimes(6));
	}
	
	@Test
	public void testEight() {
		assertEquals(list (2, 2, 2), PrimeNumbers.generatePrimes(8));
	}
	
	private ArrayList<Integer> list(int...ints) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i: ints) {
			ret.add(i);
		}
		return ret;
	}
}
