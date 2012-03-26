import static org.junit.Assert.assertEquals;
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
	
	@Test
	public void testNine() {
		assertEquals(list (3, 3), PrimeNumbers.generatePrimes(9));
	}
	
	@Test
	public void testBigNumber() {
		assertEquals(list (5, 7, 7, 1327), PrimeNumbers.generatePrimes(325115));
	}
	
	private ArrayList<Integer> list(int...ints) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i: ints) {
			ret.add(i);
		}
		return ret;
	}
	
	@Test
	public void testOneFactorization() {
		assertEquals(list(), PrimeNumbers.factorizePrimes(1));
	}
	
	@Test
	public void testTwoFactorization() {
		assertEquals(list(1), PrimeNumbers.factorizePrimes(2));
	}
	
	@Test
	public void testThreeFactorization() {
		assertEquals(list(1, 2), PrimeNumbers.factorizePrimes(3));
	}
	
	@Test
	public void testFourFactorization() {
		assertEquals(list(1, 2, 3), PrimeNumbers.factorizePrimes(4));
	}
	
	@Test
	public void testSixFactorization() {
		assertEquals(list(1, 2, 3, 5), PrimeNumbers.factorizePrimes(6));
	}
	

	@Test
	public void testEightFactorization() {
		assertEquals(list(1, 2, 3, 5, 7), PrimeNumbers.factorizePrimes(8));
	}
	
	@Test
	public void testNineFactorization() {
		assertEquals(list(1, 2, 3, 5, 7), PrimeNumbers.factorizePrimes(9));
	}
}
