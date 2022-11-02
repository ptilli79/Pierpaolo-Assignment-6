package com.coderscampus.assignment6;

import java.io.File;
import java.io.IOException;

public interface FileService {
	
	String standardFileName = "data.txt";
	
	public abstract String readLine (File file, Integer lineIndex) throws IOException;
	
	public abstract void writeLine(File file, String line) throws IOException;
	
	public abstract Integer count(File file) throws IOException;
	
}
