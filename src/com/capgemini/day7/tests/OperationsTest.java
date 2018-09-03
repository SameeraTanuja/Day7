package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



		import static org.junit.Assert.assertEquals;
		import static org.junit.jupiter.api.Assertions.*;

		import java.io.File;

		import org.junit.jupiter.api.Test;

		import com.capgemini.day7.Operations;

		class OperationsTest {

			@Test
			void testOps() {

				assertEquals(true, Operations.ops("C:\\Users\\lpilaka\\Desktop\\Sameera\\abc.txt","null",1));
				assertEquals(true, Operations.ops("C:\\Users\\lpilaka\\Desktop\\Sameera\\abc.txt","C:\\Users\\lpilaka\\Desktop\\Sameera\\abc.txt", 2));
				assertEquals(false, Operations.ops("C:\\Users\\lpilaka\\Desktop\\Sameera\\abc.txt","C:\\Users\\lpilaka\\Desktop\\Sameera\\abcd.txt", 2));
				assertEquals(true, Operations.ops("C:\\Users\\lpilaka\\Desktop\\Sameera\\abc.txt","null",3));

			}

		
		//fail("Not yet implemented");
	}


