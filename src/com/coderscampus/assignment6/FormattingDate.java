package com.coderscampus.assignment6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;


public class FormattingDate {
	   public static LocalDate StringToDate(String dob) throws ParseException {
	      //Instantiating the SimpleDateFormat class
	      SimpleDateFormat formatter = new SimpleDateFormat("MMM-yy");
	      //Parsing the given String to Date object
	      LocalDate date = formatter.parse(dob).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();;
	      //System.out.println("Date object value: "+date);
	      return date;
	   }
}