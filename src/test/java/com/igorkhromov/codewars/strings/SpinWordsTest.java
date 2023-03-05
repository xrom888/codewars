package com.igorkhromov.codewars.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpinWordsTest {

	private final SpinWords spinWords = new SpinWords();

	@Test
	void test_if_spin_words_works() {
		assertEquals("emocleW", spinWords.spinWords("Welcome"));
		assertEquals("Hey wollef sroirraw", spinWords.spinWords("Hey fellow warriors"));
	}

}