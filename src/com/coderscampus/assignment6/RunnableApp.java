package com.coderscampus.assignment6;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class RunnableApp {
	public static void main (String[] args) throws IOException, ParseException {
		
		List<Car> cars = new ArrayList<>();
		FileService fileService = new FileServiceImpl();
		String workingDir = System.getProperty("user.dir");
		File fileName;
		String[] arr;
		LocalDate date;
		workingDir=workingDir+"/data/";
		
		FileWalker fw = new FileWalker();
		PrintReportService printReport = new PrintReportService();
		
		 for(Integer i=0;i<fw.count(workingDir);i++){  
			 fileName=fw.walk(workingDir);
			 for(Integer j=1; j<fileService.count(fileName); j++){
				 arr=fileService.readLine(fileName,j).split(",");
				 date = FormattingDate.StringToDate(arr[0]);
				 cars.add(new Car(date,Integer.parseInt(arr[1]),fileName.getName().replace(".csv", "")));
		    }  
			 			 
		 }
		 //System.out.println(carMainStream.entrySet().stream());
		 
		 printReport.printYearlyReport(cars.stream().collect(Collectors.groupingBy(car  -> car.getModel(), Collectors.groupingBy(car  -> car.getDate().getYear(),Collectors.groupingBy(car  -> car.getDate().getMonth(), Collectors.summingInt(Car::getSales))))));
		 printReport.printOverallReport(cars.stream().collect(Collectors.groupingBy(car  -> car.getDate().getYear(),Collectors.groupingBy(Car::getModel, Collectors.summingInt(Car::getSales)))));
  	
	}
}
	       
	
	
