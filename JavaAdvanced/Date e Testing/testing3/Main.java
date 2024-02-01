package testing3;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
	public static void main(String[] args) {
		System.out.println(convertiData("2023-03-01T13:00:00Z"));
	}
	
	public static String convertiData(String data) {
		String date = OffsetDateTime.parse(data).atZoneSameInstant(ZoneId.of("Europe/Rome")).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
		return date;
	}
}
