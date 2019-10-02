/**
 * 
 */
package uk.ac.belfastmet.examPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author fer19171898
 *
 */
public class Codewars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Codewars codeWars = new Codewars();
		String sentence = codeWars.spinWords("spin rachel or dont");
		System.out.println(sentence);

	}

	/**
	 * take a sentence and flips any words longer than 5 or more letters
	 * 
	 * @param sentence
	 * @return
	 */
	public String spinWords(String sentence) {

		String[] myArray = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int word = 0; word < myArray.length; word++) {
			if (myArray[word].length() >= 5) {
				myArray[word] = new StringBuilder(myArray[word]).reverse().toString();
			}
			System.out.println(myArray[word]);
			sb.append(myArray[word] + " ");
		}

		sentence = sb.toString();

		return sentence.trim();

	}

	/**
	 * turns a sentence into camel case
	 * 
	 * @param str
	 * @return
	 */
	public String camelCase(String str) {
		str = str.trim();
		if (!str.isEmpty()) {

			str = str.trim().replaceAll("\\s{2,}", " ");
			String str1 = str.substring(0, 1).toUpperCase();
			String str2 = str.substring(1, str.length());
			str = str1 + str2;

			for (int i = 0; i < str.length(); i++) {

				str = str.replaceFirst(" [a-z]",
						String.valueOf(Character.toUpperCase(str.charAt(str.indexOf(" ") + 1))));
			}
		} 
		return str;
	}

}