package com.igorkhromov.codewars.algorithms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCaseMethod {

	/**
	 * Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or camelCase in Java) for strings. All words must have their first letter capitalized without spaces.
	 *
	 * For instance:
	 * camelCase("hello case"); // => "HelloCase"
	 * camelCase("camel case word"); // => "CamelCaseWord"
	 *
	 * @param str String with lowercase letters
	 * @return String where all words have their first letter capitalized without spaces.
	 */
	public String camelCase(String str) {
		return Arrays.stream(str.trim().split("\\s+"))
				.map(w -> w.length() > 0 ? w.replaceFirst(w.substring(0,1), w.substring(0,1).toUpperCase()) : "")
				.collect(Collectors.joining());
	}

}