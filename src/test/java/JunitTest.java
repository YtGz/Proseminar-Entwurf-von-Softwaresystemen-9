package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.TestClass;



public class JunitTest {

	public TestClass c;
	
	@Before
	public void setUp() throws Exception {
		c = new TestClass();
	}
	
	@Test
	public void test() {
		assertEquals(true, c.modMap());;
	}

/**
 * When using '$ gradle test' this test fails.
	@Test
	public void test() {
		assertEquals(false, c.modMap());;
	}
*
*/

}
