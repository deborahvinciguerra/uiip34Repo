package it.sopra.git;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Trodella {
	public static int calcolaEta() {
		int anni=0;
		try {
		
		String strDate1 = "1988/03/24 12:35:05";
		
		String strDate2 = "2018/03/15 20:45:07";
	
		 
		
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		fmt.setLenient(false);
		Date d1 = fmt.parse(strDate1);Date d2 = fmt.parse(strDate2);
		long millisDiff = d2.getTime() - d1.getTime();
		int days = (int) (millisDiff / 86400000);
		anni = days/365;
	
	} catch (Exception e) {
			System.err.println(e);
		}
		return anni;

		
	}
	
	public static void main(String[] args) {
		
		
			}

}
