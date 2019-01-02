package firstpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class javaversion {

	public static void main(String[] args) {
		System.out.println("Java Version:" +System.getProperty("java.version"));
		System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
		System.out.println("Java Home: "+System.getProperty("java.home"));
		
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:MM");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("EST")));
		System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
		
		//SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		//cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		
		//System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));

	}

}
