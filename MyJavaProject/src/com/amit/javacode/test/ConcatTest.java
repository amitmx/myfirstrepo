package com.amit.javacode.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.amit.javacode.Junit;

public class ConcatTest {

	@Test
	public void testConcatenate() {
		Junit j = new Junit();
		String s = j.concatenate("hello", "world");
		assertEquals("helloworld", s);
	}

}
