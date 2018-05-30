package study;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateandTimes {
	
	public static void main(String[] args) {
		System.out.println(LocalTime.now());
		
		System.out.println(LocalDate.now());
		
		System.out.println(LocalDateTime.now());
		
		LocalDate today=LocalDate.of(1123, 01, 12);
		
		System.out.println(today);
		
		LocalDate today1=LocalDate.of(2018, Month.APRIL, 11);
		
		System.out.println(today1);
		
		LocalTime amoment=LocalTime.of(6,12,6,1234); 
		
		System.out.println(amoment);
		
		LocalDateTime date=LocalDateTime.of(today, amoment);
		
		System.out.println("Date is:"+date);
		
		Period fifteenDays=Period.ofDays(10000);
		
		System.out.println(fifteenDays);
		
		Period promisedDate=Period.of(1, 1000, 1234);
		
		System.out.println(promisedDate);
		
		LocalDateTime afterWhile=date.plus(promisedDate);
		
		System.out.println("AfterWhile date is :"+afterWhile);
		
		Period wrong=Period.ofYears(2).ofDays(234).ofMonths(43); 
		
		System.out.println(wrong);
		
		DateTimeFormatter isoLocalDate=DateTimeFormatter.ISO_LOCAL_DATE; 
		
		System.out.println(isoLocalDate.format(today1));
		
		DateTimeFormatter shortFormat=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		
		System.out.println(shortFormat.format(today1));
		
		DateTimeFormatter custom=DateTimeFormatter.ofPattern("MM dd,yyyy");
		
		LocalDate today2=LocalDate.parse("02 11,18",custom);
		System.out.println(today2);
		
		

	}

}
