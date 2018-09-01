package com.capgemini.day7;

import static org.junit.jupiter.api.Assertions.*;
import java.io.File;

import org.junit.jupiter.api.Test;




class FileExist {

	@Test
	void testFile() {
		File  file=new File("C:\\Sameera");
		assertEquals(true, file.exists());

	
	}

}


