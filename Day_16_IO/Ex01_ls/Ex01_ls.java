/*
Write a program that shows on screen the names of the files in the current 
directory. (Hint: look at methods from class File).
*/

import java.io.*;

public class Ex01_ls{
	public static void main (String[] args){
	
	File folder = new File("/Users/Alexander/Applications/gitHub/BBK-PiJ-2015-42/Coursework");
	File[] listOfFiles = folder.listFiles();

	    for (int i = 0; i < listOfFiles.length; i++) {
	      if (listOfFiles[i].isFile()) {
	        System.out.println("File " + listOfFiles[i].getName());
	       }else if (listOfFiles[i].isDirectory()) {
	        System.out.println("Directory " + listOfFiles[i].getName());
	       }
	    }
	}
}