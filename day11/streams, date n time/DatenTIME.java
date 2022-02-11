package co.kishore.day11.Streams;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DatenTIME {
	public static void LocalDateTimeApi() {
		
		LocalDate date= LocalDate.now();
		System.out.println("the current date is "+date);
		
		LocalTime time=LocalTime.now();
		System.out.println("the current time is "+time);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("Current date n time is "+current);
		
		DateTimeFormatter format= DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
		
		String formatdatetime = current.format(format);
		
		System.out.println("in format manner "+formatdatetime);
		
		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int secs = current.getSecond();
		System.out.println("month :"+month+"day :"+day+"secs :"+secs);
		
		LocalDate date2 = LocalDate.of(1950, 1, 26);
		System.out.println("the republic day :"+date2);
		
		LocalDateTime spldate = current.withDayOfMonth(9).withYear(2001);
		System.out.println("specific date with "+"current time "+spldate);
		
		
		
	}
	public static void main(String[] args) {
		LocalDateTimeApi();
	}

}
