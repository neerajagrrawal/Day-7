package com.capgemini.entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {
	public int countWordsInFile(String fileLocation) throws Exception {
		int count=0 ;
		FileReader fr=new FileReader(fileLocation) ;
		BufferedReader reader ;
		reader=new BufferedReader(fr) ;
		for(reader.mark(1000);reader.readLine()!=null;)
		{
			//System.out.println(reader.readLine());
			reader.reset();
			count+=reader.readLine().split(" ").length ;
			reader.mark(1000);
		}
		return count ;
	   
	}
}
