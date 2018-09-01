package com.capgemini.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.entity.PatternSearch;



class Question4Test {

	@Test
	void testPatternSearch() throws FileNotFoundException, IOException {
		File file = new File("C:\\Users\\neagrawa\\Desktop\\neeraj.txt");

		assertEquals("Line number 4 : neeraj hi\n", PatternSearch.findString(file,"neeraj hi"));
	}

}
