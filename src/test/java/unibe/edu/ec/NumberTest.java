package unibe.edu.ec;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberTest {

private Number p1;
	
	@Before
	public void Before() {
		this.p1 = new Number(7,10);
	}
	@Test
	public void addNumbers() {
		assertEquals(17, this.p1.addNumbers());
	}
	
	@Test
	public void substractionNumbers() {
		assertEquals(-3, this.p1.substractionNumbers());
	}
}
