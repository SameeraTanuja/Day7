package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.Grep;

import java.io.File;

		

		class GrepTest {

			@Test
			void testGrep() {
				File file=new File("C:\\Users\\lpilaka\\Desktop\\Sameera\\abc.txt");
				assertEquals(true,Grep.stringSearch(file,"in"));

			}

		

		//fail("Not yet implemented");
	}


