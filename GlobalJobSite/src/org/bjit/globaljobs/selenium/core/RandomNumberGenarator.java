package org.bjit.globaljobs.selenium.core;

import java.util.Random;

public class RandomNumberGenarator {
	Random ran = new Random();

	public int randomGenerator(int number) {
		int random_Number = ran.nextInt(number);
		if (random_Number == 0)
			randomGenerator(number);
		return random_Number;
	}

}
