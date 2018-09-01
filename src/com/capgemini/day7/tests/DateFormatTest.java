package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.DateFormat;



class DateFormatTest {

	@Test
	void test() {
		
			assertEquals(true, DateFormat.checkMagic(2,2,04));
			assertEquals(false, DateFormat.checkMagic(2,2,14));
		}
		//fail("Not yet implemented");
	}


