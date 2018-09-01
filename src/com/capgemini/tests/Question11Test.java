package com.capgemini.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.entity.BinaryInteger;

class Question11Test {

	@Test
	void testBinaryInteger() {
		File file = new File("C:\\Users\\neagrawa\\Desktop\\neeraj.dat");
		assertEquals(1,BinaryInteger.writeBinary(file));
	}

}
