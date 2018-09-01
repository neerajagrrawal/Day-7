package com.capgemini.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.entity.VowelsAndConsonants;



class Question6Test {

	@Test
	void testVowelsAndConsonants() throws IOException {
		File file = new File(
				"C:\\Users\\\\neagrawa\\Desktop\\neeraj.txt");

		assertEquals("Number of vowels = 4\nNumber of consonants = 67", VowelsAndConsonants.findVowelAndConsonant(file));
	}

}