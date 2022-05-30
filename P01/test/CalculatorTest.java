import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

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
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAdd() {
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,  b);
		
		int expected = 9999;
		assertEquals (expected, actual);
	}
	
	@Test
	public final void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(actual, expected);
	}
	
	@Test
	public final void testMultiply() {
		int a = 55;
		int b = 66;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a,b);
		
		int expected = 3630;
		assertEquals(actual, expected);
		
	}
	
	@Test
	public final void testDivide() {
		int a = 8000;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		
		int expected = 4000;
		assertEquals(actual, expected);
		
	}
	
	@Test
	public final void testAddBoundaryCase() {
		int a = -1;
		int b = -1;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
		assertEquals(-2, actual);
		
	}}
	
	//can add more boundary Junits




