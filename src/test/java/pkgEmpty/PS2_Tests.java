package pkgEmpty;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PS2_Tests {
	
	
	int integerA = 1;
	int integerB = 2;
	int integerC = 3;
	int integerD = 4;
	int integerE = 5;
	int integerF = 11;
	int integerG = 12;
	int integerH = 22;
	
	
	MyInteger test1 = new MyInteger(integerA);
	
	MyInteger test2 = new MyInteger(integerB);
	
	MyInteger test3 = new MyInteger(integerC);
	
	MyInteger test4 = new MyInteger(integerD);
	
	MyInteger test5 = new MyInteger(integerE);

	MyInteger test11 = new MyInteger(integerF);
	
	MyInteger test12 = new MyInteger(integerG);
	
	MyInteger test20 = new MyInteger(integerH);


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
		
		assertTrue(MyInteger.isEven(integerB));
		assertFalse(MyInteger.isEven(integerA));
		assertFalse(MyInteger.isEven(test1));
		assertTrue(MyInteger.isEven(test2));
	}

	@Test
	public void testisOdd() {
		
		assertTrue(MyInteger.isOdd(integerC));
		assertFalse(MyInteger.isOdd(integerD));
		assertFalse(MyInteger.isOdd(test4));
		assertTrue(MyInteger.isOdd(test3));
	}

	@Test
	public void testisPrime() {
		
		assertTrue(MyInteger.isPrime(integerE));
		assertTrue(MyInteger.isPrime(integerF));
		assertFalse(MyInteger.isPrime(integerG));
		assertFalse(MyInteger.isPrime(integerH));
		assertTrue(MyInteger.isPrime(test5));
		assertTrue(MyInteger.isPrime(test11));
		assertFalse(MyInteger.isPrime(test12));
		assertFalse(MyInteger.isPrime(test20));
		
		boolean num = MyInteger.isPrime(test4);
		assertEquals(test4.isPrime(),num);
		
	}

	@Test
	public void testequals() {
		
		assertTrue(test12.equals(integerG));
		assertFalse(test12.equals(test5));
		assertFalse(test12.equals(integerF));
		assertEquals(test5.equals(test5),true);
	}
}
