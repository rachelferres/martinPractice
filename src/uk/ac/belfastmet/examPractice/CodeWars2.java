/**
 * 
 */
package uk.ac.belfastmet.examPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author fer19171898
 *
 */
public class CodeWars2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> animals = new ArrayList<String>();
		animals.add("fly");
		animals.add("spider");
		animals.add("fly");
		animals.add("fly");
		System.out.println(oldLadySwallows(animals));

	}

	public static List<String> oldLadySwallows(final List<String> animals) {

		List<String> animalsInOrder = new ArrayList<String>(
				Arrays.asList("fly", "spider", "bird", "cat", "dog", "goat", "cow", "horse"));

		for (int index = 1; index < animals.size(); index++) {
			for (int index2 = 0; index2 < index; index2++) {
				while(animals.contains("fly")) {
				if (animals.get(index).equals("spider") && animals.get(index + 1).equals("fly")
						|| animals.get(index - 1).equals("fly")) {
					
					animals.remove(index + 1);
					animals.remove(index - 1);
					}
				}
			}
		}

		return animals;
	}
}
