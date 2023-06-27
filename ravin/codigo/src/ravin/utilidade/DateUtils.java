package ravin.utilidade;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static Date stringToDate(String dateString) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date parsedDate = null;
		try {
			parsedDate = dateFormat.parse(dateString);
		} catch (ParseException e) {

		}
		return parsedDate;

	}

}
