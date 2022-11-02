package com.coderscampus.assignment6;

import java.util.Map;

public class PrintReportService {
	
	public void printYearlyReport(Map<Object,Map<Object,Map<Object,Integer>>> map){
		
		
		   Integer maxSalesValue=null;
		   Integer minSalesValue=null;
		   Object maxSalesKey=null;
		   Object minSalesKey=null;
		   Object maxYearKey=null;
		   Object minYearKey=null;
		 
		   for (Map.Entry<Object, Map<Object,Map<Object, Integer>>> modelKey : map.entrySet()) {
			   System.out.println("---------------------------------------------------------\n");
			   Map<Object, Map<Object,Integer>> yearKey = modelKey.getValue();
			   System.out.println(modelKey.getKey()+" Yearly Sales Report ");
			   maxSalesValue=null;
			   minSalesValue=null;
			   maxYearKey=null;
			   minYearKey=null;
			   maxSalesKey=null;
			   minSalesKey=null;
			   for (Map.Entry<Object, Map<Object, Integer>> monthKey : yearKey.entrySet()) {
				   Map<Object, Integer> salesKey = monthKey.getValue();
				   //System.out.println(monthKey.getKey());
				   Integer sumSalesValue = 0;
					   
				   for (Map.Entry<Object, Integer> addressSet : salesKey.entrySet()) {
					   //System.out.println(addressSet.getKey() + " :: " + addressSet.getValue());
					   sumSalesValue = sumSalesValue + addressSet.getValue(); 
		               if(maxSalesValue == null || addressSet.getValue().compareTo(maxSalesValue) > 0) {
		            	   maxSalesValue = addressSet.getValue();
		    	           maxSalesKey = addressSet.getKey();
		                   maxYearKey=monthKey.getKey();                    
		    	       }
		               if(minSalesValue == null || addressSet.getValue().compareTo(minSalesValue) < 0) {
		                    minSalesValue = addressSet.getValue();
	    	                minSalesKey = addressSet.getKey();
	    	                minYearKey=monthKey.getKey();     	
		               }      
		            }
				   	System.out.println(monthKey.getKey()+" --> "+sumSalesValue);
			   }
			   System.out.println("\nThe best month for "+modelKey.getKey()+" was "+maxYearKey+"-"+maxSalesKey+" with "+maxSalesValue);
			   System.out.println("The worst month for "+modelKey.getKey()+" was "+minYearKey+"-"+minSalesKey+" with "+minSalesValue);
			   System.out.println("\n");
		 //System.out.println("---------------------------------------------------------");
		   }	
	}
	
	public void printOverallReport(Map<Object,Map<String,Integer>> map){
		
		 System.out.println("---------------------------------------------------------\n");
		 System.out.println("Overall Yearly Report\n");
		 Integer maxValue;
		 String maxValueKey;
		 
		 for (Map.Entry<Object, Map<String, Integer>> empMap : map.entrySet()) {
			 Map<String, Integer> addMap = empMap.getValue();
			 //System.out.println(empMap.getKey());
			 maxValue = null;
			 maxValueKey = null;
			 // Iterate InnerMap
			 for (Map.Entry<String, Integer> addressSet : addMap.entrySet()) {
	            if (maxValue == null || addressSet.getValue().compareTo(maxValue)> 0) {
	            	maxValue = addressSet.getValue();
	                maxValueKey = addressSet.getKey();   
	            }
	        }
			 System.out.println(empMap.getKey()+" --> "+" Model "+ maxValueKey+" --> "+"Total Sales: "+maxValue);
		 
		 }
		 System.out.println("\n---------------------------------------------------------");	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
