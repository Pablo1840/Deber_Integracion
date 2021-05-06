package unibe.edu.ec;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NameTest {

	private Name name;

	@Before
	    public void before() {
	        this.name = new Name("pablo salazar");
	}
	@Test
	public void countCaracters() {
		assertEquals(13, this.name.countCaracters());
	}
	
	@Test
	public void reversePhrase() {
		assertEquals("razalas olbap", this.name.reversePhrase());
	}

}
