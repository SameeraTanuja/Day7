package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Test;

import com.capgemini.day7.ValidDate;


		class ValidateDateTest {


					@Test
					void test() {
						assertEquals(false, ValidDate.valid("29/02/2011",2));
						assertEquals(true, ValidDate.valid("29/02/2012",2));
						assertEquals(true, ValidDate.valid("20/09/2015",2));
					}

				
			

		//fail("Not yet implemented");
	}


