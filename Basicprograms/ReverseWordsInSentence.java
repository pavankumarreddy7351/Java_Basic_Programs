package com.telus.Basicprograms;

public class ReverseWordsInSentence {
	public static void main(String[] args) {
		String input = "Welcome to Xavient Digital";
		String reversedSentence = reverseWords(input);
		System.out.println("Input: " + input);
		System.out.println("Output: " + reversedSentence);
	}

	public static String reverseWords(String sentence) {
		String[] words = sentence.split(" "); // Split the sentence into words using space as a delimiter
		StringBuilder reversed = new StringBuilder();

		// Iterate through the words in reverse order and append them to the StringBuilder
		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]);
			if (i > 0) {
				reversed.append(" "); // Add a space between words except for the last word
			}
		}

		return reversed.toString();
	}
}
