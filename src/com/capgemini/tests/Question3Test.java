package com.capgemini.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.entity.CountWords;

class Question3Test {

	@Test
	void testCountWords() throws Exception {
		CountWords c1=new CountWords() ;
		assertEquals(11, c1.countWordsInFile("C:\\Users\\neagrawa\\Desktop\\neeraj.txt"));
	}

}
