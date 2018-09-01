package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.DateFormat1;

class DateFormat1Test {


			@Test
			
				void testDateFormat() throws ParseException {
			assertEquals("12/12/2010",DateFormat1.dateFormat1("12122010"));
			 assertEquals("12 December, 2010",DateFormat1.dateFormat01("12122010"));
			}

		
		//fail("Not yet implemented");
	}


