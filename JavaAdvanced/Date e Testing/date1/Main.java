package date1;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
	public static void main(String[] args) {
		ZonedDateTime dateParam = OffsetDateTime.parse("2002-03-01T13:20:00Z").atZoneSameInstant(ZoneId.systemDefault());
		System.out.println(dateParam);
		String dateTime = dateParam.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
		System.out.println(dateTime);
		dateTime = dateParam.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
		System.out.println(dateTime);
		dateTime = dateParam.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
		System.out.println(dateTime);
	}
}
