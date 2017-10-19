import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ImpementationTest {

	private Implementation obj;
	

	@Before
	public void setUp() throws Exception {
		obj = new Implementation();
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
		
	}

	@Test
	public void testAdd() {
		long ans = 5 + 2 + 1;
		assertEquals(ans, obj.Add(5 , 2, 1));
		
		ans = 15 + 10;
		assertEquals(ans, obj.Add(10 , 15));
	}
	@Test
	public void testsubtract() {
		long ans = 5 - 2 - 1;
		assertEquals(ans, obj.subtract(5 , 2, 1));
		
		ans = 15 - 10;
		assertEquals(ans, obj.subtract(15 , 10));
	}
	@Test
	public void testMul() {
		long ans = 5 * 2 * 1;
		assertEquals(ans, obj.Mul(5 , 2, 1));
		
		ans = 15 * 10;
		assertEquals(ans, obj.Mul(15 , 10));
	}

	@Test
	public void testDiv() {
		long ans = 6 / 2 / 12;
		assertEquals(ans, obj.Div(6 , 2, 12));
		
		
	}
}
