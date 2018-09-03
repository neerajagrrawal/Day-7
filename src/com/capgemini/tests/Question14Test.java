package com.capgemini.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.entity.FileOperations;

class Question14Test {

	@Test
	void testReverse() {
		assertEquals(true, FileOperations.reverse("C:\\Question14\\Text.txt","C:\\Question14\\revOutput.txt"));
		assertEquals(true, FileOperations.convert("C:\\Question14\\Text.txt","C:\\Question14\\convertOutput.txt"));
		assertEquals(true, FileOperations.compare("C:\\Question14\\Text.txt","C:\\Question14\\wordCount.txt"));
	}

}
