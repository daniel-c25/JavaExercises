package date4;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

	public static void main(String[] args) {
		ZonedDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z").atZoneSameInstant(ZoneId.of("Europe/Rome"));
		data = data.plusYears(1);
		data = data.minusMonths(1);
		data = data.plusDays(7);
		System.out.println(data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));
	}

}
