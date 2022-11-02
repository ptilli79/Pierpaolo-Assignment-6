package com.coderscampus.assignment6;

import java.io.File;
import java.io.IOException;

public class FileWalker {
	private Integer nextIndex; 
	
    public FileWalker(){
        this.nextIndex = 0;
    }

    public File walk(String path) throws IOException {

        File root = new File( path );
        File[] list = root.listFiles();
//        FileService fileService = new FileServiceImpl();
//        String line = "";
        File fileDirName=null;
        Integer counter=0;
        
       

        if (list == null) return (File) null;

        for ( File f : list ) {
        	fileDirName = f;
        	//System.out.println(fileDirName);
        	if (counter.equals(nextIndex)) {
            if ( f.isDirectory() ) {
                //System.out.println( "Dir:" + f.getAbsoluteFile() );
                break;
            }
            else {
                //System.out.println( "File:" + f.getAbsoluteFile() );
                fileDirName=f.getAbsoluteFile();
                nextIndex++;
//                while ((line=fileService.readLine(fileDirName)) != null) {
//                	System.out.println(line);
//                	break;
//                }
                break;
              }
            
            }
        	counter++;
        }
        return fileDirName;
        }
    
    
    public Integer count(String path) throws IOException {		
            File root = new File( path );
            File[] list = root.listFiles();
//            FileService fileService = new FileServiceImpl();
//            String line = "";
//            Integer counter=0;
            
            if (list == null) return null;
//            for ( File f : list ) {
//            	counter++;	
//            }
            return list.length;
    }
}
    
    
    
    
    
    

