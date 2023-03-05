package com.igorkhromov.codewars.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamelCaseMethodTest {

	private final CamelCaseMethod camelCase = new CamelCaseMethod();
	
	@Test
	void testTwoWords() {
		System.out.println(camelCase.camelCase("test case"));
		assertEquals("TestCase", camelCase.camelCase("test case"));
	}

	@Test
	void testThreeWords() {
		assertEquals("CamelCaseMethod", camelCase.camelCase("camel case method"));
	}

	@Test
	void testLeadingSpace() {
		assertEquals("CamelCaseWord", camelCase.camelCase(" camel case word"));
	}

	@Test
	void testTrailingSpace() {
		assertEquals("SayHello", camelCase.camelCase("say hello "));
	}

	@Test
	void testSingleLetter() {
		assertEquals("Z", camelCase.camelCase("z"));
	}

	@Test
	void testTwoSpacesBetweenWords() {
		assertEquals("AbC", camelCase.camelCase("ab  c"));
	}

	@Test
	void testEmptyString() {
		assertEquals("", camelCase.camelCase(""));
	}

}