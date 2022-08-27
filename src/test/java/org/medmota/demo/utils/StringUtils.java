package org.medmota.demo.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class StringUtils {

	@ParameterizedTest
	@ValueSource(strings = { "racecar", "radar", "level", "refer", "deified", "civic" })
	void isPalindrome(String word) {
		assertTrue(StringUtils.isPalindrome(word));

	}

}
