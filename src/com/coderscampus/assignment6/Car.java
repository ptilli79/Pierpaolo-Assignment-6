package com.coderscampus.assignment6;

import java.time.LocalDate;
import java.util.Date;

public class Car {

	private Integer sales;
	private LocalDate date;
	private String model;
	
	public Car (LocalDate date, Integer sales, String model) {
		this.date = date;
		this.sales = sales;
		this.model = model;
	}
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Integer getSales() {
		return sales;
	}
	public void setSales(Integer sales) {
		this.sales = sales;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
