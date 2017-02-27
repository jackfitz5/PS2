package pkgEmpty;

import static org.junit.Assert.*;

import org.junit.After;

import org.junit.AfterClass;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;



public class PS2_Tests {
	
	
	int integerA = 2;
	int integerB = 3;
	int integerC = 4;
	int integerD = 5;

	
	
		MyInteger test1 = new MyInteger(integerA);
	
		MyInteger test2 = new MyInteger(integerB);
	
		MyInteger test3 = new MyInteger(integerC);
	
		MyInteger test4 = new MyInteger(integerD);
		


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testisEven() {
		
		assertEquals(true, MyInteger.isEven(integerA));
		assertEquals(false, MyInteger.isEven(integerB));
		
		assertEquals(true, MyInteger.isEven(test1));
		assertEquals(false, MyInteger.isEven(test2));
	}

	@Test
	public void testisOdd() {
		
		assertEquals(true, MyInteger.isOdd(integerB));
		assertEquals(false, MyInteger.isOdd(integerC));
		
		assertEquals(true, MyInteger.isOdd(test4));
		assertEquals(false, MyInteger.isOdd(test3));
	}

	@Test
	public void testisPrime() {
		
		assertEquals(true, MyInteger.isPrime(integerD));
		assertEquals(true, MyInteger.isPrime(integerA));
		
		assertEquals(true, MyInteger.isPrime(test2));
		assertEquals(false, MyInteger.isPrime(test3));
		
	}

	@Test
	public void testequals() {
		
		assertEquals(true, test1.equals(integerA));
		assertEquals(true, test2.equals(test2));
		assertEquals(false, test3.equals(test1));
		assertEquals(false, test4.equals(integerC));
		
	}
}
