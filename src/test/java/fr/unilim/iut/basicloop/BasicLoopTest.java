package fr.unilim.iut.basicloop;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BasicLoopTest {

	@Test
	public void should_handle_input() {
		assertEquals(new BasicLoop().doSomethingWithInput("foobar"), "< foobar");

	}

}