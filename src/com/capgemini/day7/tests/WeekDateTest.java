package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.WeekDate;

class WeekDateTest {

	@Test
	void test() {
		assertEquals("Saturday,September 01,2018",WeekDate.displayWeekDay());
		 
		//fail("Not yet implemented");
	}

}
