package com.example.demo.basics;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDateTime dt = LocalDateTime.now();

		System.out.println(d +"\t" + t +"\t" + dt);
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		
		
		LocalDateTime dtz = LocalDateTime.now(ZoneId.of("GMT"));
		System.out.println(dtz);
		
		Instant in = Instant.now();
		System.out.println(in);
	}

}
