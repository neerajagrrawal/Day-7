package com.capgemini.entity;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class CountLines {
	
	public int countLinesInFile(String fileLocation) throws IOException {
		int count=0;
		FileReader fr=new FileReader(fileLocation) ;
		BufferedReader reader = new BufferedReader(fr) ;
		while(reader.readLine()!=null)
		{
			//System.out.println(reader.readLine());
			count++ ;
		}
			
		return count ;
	   
	}
}
