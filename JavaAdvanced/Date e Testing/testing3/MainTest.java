package testing3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void testDateConvertor() {
		String expectedDate = "1 marzo 2023";
		assertEquals(expectedDate, Main.convertiData("2023-03-01T13:00:00Z"));
		
	}

}
