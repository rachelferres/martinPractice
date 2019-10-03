/**
 * 
 */
package uk.ac.belfastmet.examPractice;

import java.util.Arrays;

/**
 * @author fer19171898
 *
 */
public class CodingBat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CodingBat codingBat = new CodingBat();
		//int[] nums = { 0, 10, 0, 2 };
		//int[] newnums = codingBat.zeroMax(nums);
		//for (int index = 0; index < newnums.length; index++) {
		//	System.out.println(newnums[index]);
		//}
		fizzBuzz(0, 15);
	}
//	Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. 
//	If there is no odd value to the right of the zero, leave the zero as a zero.
//
//	zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
//	zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
//	zeroMax([0, 1, 0]) → [1, 1, 0]

	public int[] zeroMax(int[] nums) {

		for (int index = 0; index < nums.length; index++) {
			int maxNum = nums[index];
			if (nums[index] == 0) {
				for (int index2 = index; index2 < nums.length; index2++) {
					if (maxNum < nums[index2] && nums[index2] % 2 == 1) {
						maxNum = nums[index2];
					}

				}
			}
			nums[index] = maxNum;
		}

		return nums;
	}

	public int bigDiff(int[] nums) {
		int largest = 0;
		int smallest = nums[0];

		for (int index = 0; index < nums.length; index++) {
			if (nums[index] > largest) {
				largest = nums[index];
			}
			if (nums[index] < smallest) {
				smallest = nums[index];
			}
		}
		return largest - smallest;
	}

	public int[] withoutTen(int[] nums) {
		int holdingInt;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] == 10) {
				nums[index] = 0;
			}
		}
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] == 0) {

			}
		}

		return nums;
	}

	public static int[] withoutTenAgain(int[] in) {
		int shift = 0;
		int[] out = in;
		int highest;
		for (int index = 0; index < out.length; index++) {
			if (in[index] == 10) {
				out[(out.length - 1) - shift] = 0;
				shift++;
			}

			System.out.println(Arrays.toString(out));
		}

		return in;
	}

	public static int[] withoutTenAgain2(int[] nums) {
		int[] newNums = new int[nums.length];
		int tensCount = 0;
		int holdingPlace = 0;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != 10) {
				newNums[holdingPlace] = nums[index];
				holdingPlace++;
			}
		}

		return newNums;
	}

	public boolean gHappy(String str) {
		boolean happy = false;

		for (int index = 0; index < str.length() - 1; index++) {
			if ((str.charAt(index) == 'g' && str.charAt(index + 1) == 'g')
					|| (str.charAt(index) == 'g' && str.charAt(index - 1) == 'g')) {
				happy = true;

			} else if ((str.charAt(index) == 'g' && str.charAt(index + 1) != 'g')
					|| (str.charAt(index) != 'g' && str.charAt(index + 1) == 'g')) {
				happy = false;
			}

		}
		if (!str.contains("g")) {
			happy = true;
		}

		return happy;

	}

	/**
	 * Given a string, return true if the number of appearances of "is" anywhere in
	 * the string is equal to the number of appearances of "not" anywhere in the
	 * string (case sensitive).
	 * 
	 * @param str
	 * @return
	 */
	public boolean equalIsNot2(String str) {

		int countIs = 0;
		int countNot = 0;
		boolean result = false;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'i' && str.charAt(i + 1) == 's') {
				countIs++;
			} else if (str.charAt(i) == 'n' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 't') {
				countNot++;
			}
		}
		if (countIs == countNot) {
			result = true;
		}

		return result;
	}
	

	/**
	 * Given a string, count the number of words ending in 'y' or 'z'
	 * 
	 * @param str
	 * @return
	 */
	public int countYZ(String str) {
		int beginString = 0;
		int endString;
		int xyCount = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ' ' || index == str.length()) {
				endString = index;
				String temp = str.substring(beginString, endString);
				if (temp.endsWith("y") || temp.endsWith("z")) {
					xyCount++;
				}
				beginString = endString;
			}
		}

		return xyCount;
	}

	/**
	 * 
	 * @param str
	 * @return count
	 */
	public static int countYZmo(String str) {

		str = str.replaceAll("[^a-zA-Z]", " ");// regex to remove any non alphabetical characters
		str = str.toLowerCase();
		String[] words = str.split(" ");
		int count = 0;
		for (int index = 0; index < words.length; index++) {
			if (words[index].endsWith("y") || words[index].endsWith("z")) {
				count++;
			}

		}

		return count;
	}

	/**
	 * Given two strings, base and remove, return a version of the base string where
	 * all instances of the remove string have been removed
	 * 
	 * @param base
	 * @param remove
	 * @return
	 */
	public String withoutString(String base, String remove) {

		String baseRemove = base.replace(remove, "");

		remove = remove.toLowerCase();
		baseRemove = baseRemove.replace(remove, "");
		return baseRemove;

	}
	/**
	 * takes a specified start and end point, makes that the array length and then prints out Fizz, Buzz, or FizzBuzz
	 * @param start
	 * @param end
	 * @param result
	 * @param currentNumber
	 * @return
	 */
	public static String[] fizzBuzz(int start, int end) {
		String[] fizzOrBuzz = new String[end - start];
		String result = "";
		int currentNumber = start;
		for (int index = 0; index < fizzOrBuzz.length; index++) {
			if (currentNumber % 15 == 0) {
				result = "FizzBuzz";
			} else if (currentNumber % 5 == 0) {
				result = "Buzz";
			} else if (currentNumber % 3 == 0) {
				result = "Fizz";
			} else {
				result = String.valueOf(currentNumber);
			}
			fizzOrBuzz[index] = result;
			currentNumber++;
		}
		
		for (int i = 0; i < fizzOrBuzz.length; i++) {
			System.out.println(fizzOrBuzz[i]);
		}

		return fizzOrBuzz;
	}
	
	public boolean haveThree(int[] nums) {
		  boolean result = false;
		  int countThrees=0;
		  for(int index = 0; index < nums.length; index++){
		    if(nums[index]==3){
		       countThrees++;
		     }
		  }
		  if(countThrees == 3){
		    for(int index = 0; index < nums.length-1; index++){
		      if(nums[index]==3 && nums[index+1]==3){
		        result = false;
		        break;
		    }else{
		      result = true;
		    }
		    
		    }
		    }
		  
		  return result;
		}

}
