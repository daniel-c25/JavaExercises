package testing4;

import static org.junit.Assert.*;

import java.time.DayOfWeek;
import java.time.OffsetDateTime;

import org.junit.Test;

public class TestOperations {
	
	DateOperations operations = new DateOperations(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
	
	@Test
	public void testOperations() {
		
		//test on getting the year
		assertEquals(2023, operations.getYear());
		assertEquals(3, operations.getMonth());
		assertEquals(1, operations.getDay());
		assertEquals(DayOfWeek.WEDNESDAY, operations.getDayOfWeek());
		
	}

}
