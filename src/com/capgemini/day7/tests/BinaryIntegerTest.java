package com.capgemini.day7.tests;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.BinaryInteger;

public class BinaryIntegerTest {
	
	

		
			@Test
			void testBinaryInteger() {
				File file = new File("C:\\Naina\\Naveena.txt");
				assertEquals(1,BinaryInteger.writeBinary(file));
			}

		}


