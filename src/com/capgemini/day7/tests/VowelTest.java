package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import com.capgemini.day7.VowelsCount;

import org.junit.jupiter.api.Test;

class VowelTest {

	@Test
	void test() {
		File file=new File("C:\\Users\\lpilaka\\Desktop\\Sameera\\abc.txt");
	
		
			
			assertEquals(144,VowelsCount.countVowels(file));
		}
	}


