package com.coderscampus.assignment6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;


public class FileServiceImpl extends Object implements FileService {
	
	@Override
	public String readLine(File file, Integer lineIndex) throws IOException {
		BufferedReader reader = null;
		Integer line_counter=0;
		String line="";
		try {
			reader = new BufferedReader(new FileReader(file));
			while (((line = reader.readLine()) != null)) {
				if (line_counter.equals(lineIndex)) { 
					break;
				}
				line_counter++;		
			}
			return line;
		} finally {
			if (reader != null) reader.close();
		}
	}

	@Override
	public void writeLine(File file, String line) throws IOException {
		
	}
	
	public Integer count(File file) throws IOException {
	BufferedReader fileReader = null;
	LineNumberReader lnr  = null;
	int line_counter=0;
	
	fileReader = new BufferedReader(new FileReader(file));
	try {
	lnr = new LineNumberReader(fileReader);
	while ((lnr.readLine()) != null) {
//	System.out.println("File line number: " + lnr.getLineNumber());
		line_counter=lnr.getLineNumber();
	}
	return line_counter;
	//Create array user based on line counter value
	}finally {
		if (lnr != null) lnr.close();
		
	}
	}


}
