package com.capgemini.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class Question1Test {

	@Test
	void testExistenceOfFile() {
		File file = new File("C:\\msdia80.dll");
		assertEquals(true, file.exists());
	}

}
