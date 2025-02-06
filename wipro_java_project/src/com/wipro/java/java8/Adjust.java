/**
 * 
 */
package com.wipro.java.java8;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Adjust {
/* A function to check date and time
 * according to our requirement*/
	public static void checkingAdjusters() {
	LocalDate date =  LocalDate.now();
	System.out.println("The current date is " + date);
	//To get the first date of the next month.
	LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
	//get the next saturday.
	LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
	System.out.println("The next saturday from now is " + nextSaturday);
	
	//First day of current month.
	LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
	System.out.println("The first day of month is " + firstDay);
	
	
	//Last day of current month.
	LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
	System.out.println("The Last day of month is " + lastDay);
	}

	
	public static void main(String[] args) {
		checkingAdjusters();

	}

}
