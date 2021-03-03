package Programas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class teste_Date {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

		Date x1 = sdf1.parse("01/01/2018");
		System.out.println(x1);
		System.out.println(sdf1.format(x1));
		Date x2 = Date.from(Instant.parse("2018-01-01T15:42:07Z"));
		System.out.println(x2);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(x1);
		Integer minutes = cal.get(Calendar.MINUTE);
		Integer month = cal.get(Calendar.MONTH);
		Integer week_year = cal.get(Calendar.WEEK_OF_YEAR);
		Integer week_month = cal.get(Calendar.WEEK_OF_MONTH);
		
		System.out.println("minutes: "+minutes+"\n"+
				           "month: "+month+"\n"+
				           "week_year: "+week_year+"\n"+
				           "week_month: "+week_month+"\n");
		
		
		
	}

}
