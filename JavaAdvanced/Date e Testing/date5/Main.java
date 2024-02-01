package date5;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {
		ZonedDateTime firstDate = OffsetDateTime.parse("2023-03-01T13:00:00Z").atZoneSameInstant(ZoneId.of("Europe/Rome"));
		ZonedDateTime secondDate = OffsetDateTime.parse("2024-03-01T13:00:00Z").atZoneSameInstant(ZoneId.of("Europe/Rome"));
		
		System.out.println("prima data precedente alla seconda? -> " + firstDate.isBefore(secondDate));
		System.out.println("seconda data successiva alla prima? -> " + firstDate.isAfter(secondDate));
		System.out.println("sono date uguali?" + firstDate.isEqual(secondDate));
		
		
	}

}
