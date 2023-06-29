package ravin.utilidade;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class UtilitarioData {

	public static Date stringParaDate(String dataString) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date parsedDate = null;
		try {
			parsedDate = dateFormat.parse(dataString);
		} catch (ParseException e) {

		}
		return parsedDate;
	}

	public static int getIdade(Date dataNascimento) {
		GregorianCalendar hoje = new GregorianCalendar();
		GregorianCalendar nascimento = new GregorianCalendar();
		if (dataNascimento != null) {
			nascimento.setTime(dataNascimento);
		}
		int anoHoje = hoje.get(Calendar.YEAR);
		int anoNascimento = nascimento.get(Calendar.YEAR);
		return anoHoje - anoNascimento;
	}

}
