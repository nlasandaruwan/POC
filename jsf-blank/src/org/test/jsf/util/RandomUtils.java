package org.test.jsf.util;

import java.util.Random;

public class RandomUtils {

	public static String randomElement(String[] pages){
		
		int idx = new Random().nextInt(pages.length);
		String random = (pages[idx]);
		return random;
	}
}
