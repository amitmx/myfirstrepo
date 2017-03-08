package com.amit.javacode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.amit.javacode.Junit;

public class AddTest {

	@Test
	public void testAdd() {
		Junit j = new Junit();
		int result = j.add(3, 7);
		assertEquals(10, result);
		
	}

}
