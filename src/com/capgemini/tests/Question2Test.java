package com.capgemini.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.entity.CountLines;

class Question2Test {

	@Test
	void testFileExistence() throws IOException {
		CountLines c1=new CountLines() ;
		assertEquals(6, c1.countLinesInFile("C:\\Users\\neagrawa\\Desktop\\neeraj.txt"));
	}

}
