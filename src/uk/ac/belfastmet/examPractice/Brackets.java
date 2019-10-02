/**
 * 
 */
package uk.ac.belfastmet.examPractice;

import java.util.Stack;

/**
 * @author fer19171898 [()]
 */
public class Brackets {

	public static String balancesBrackets(String input) {
		String result = "Not Balanced";

		char[] inputCharArray = input.toCharArray();

		for (int index1 = 0; index1 < inputCharArray.length; index1++) {
			if(inputCharArray.length%2!=0)
				break;
			for (int index2 = 0; index2 < inputCharArray.length; index2++) {
				if (inputCharArray[index1] == '(' && inputCharArray[index2] == ')') {
					result = "Balanced";
				}
				else if (inputCharArray[index1] == '[' && inputCharArray[index2] == ']') {
					result = "Balanced";
				} 
				else if (inputCharArray[index1] == '{' && inputCharArray[index2] == '}') {
					result = "Balanced";
				}
			}
		}
		return result;

	}
	/**
	 * gives an int count to each bracketr and compares at the end. for loop to try and take into account closing brackets before open brackets
	 * @param input
	 * @return
	 */
	public static String balancesBrackets2(String input) {
		String result = "Not Balanced";
		char[] inputCharArray = input.toCharArray();
		int countOpenBrack=0;
		int countCloseBrack=0;
		int openCurly=0;
		int closeCurly = 0;
		int openSquare = 0;
		int closeSquare =0;
		int indexOfOpen=inputCharArray.length;
		int indexOfClose=inputCharArray.length;
		
		for (int i = 0; i < inputCharArray.length; i++) {
			
			if(inputCharArray[i]==')') {
				indexOfClose=i;
			}
			if(inputCharArray[i]=='(') {
				indexOfOpen=i;
			}
			if(inputCharArray[i]=='}') {
				indexOfClose=i;
			}
			if(inputCharArray[i]=='{') {
				indexOfOpen=i;
			}
			if(inputCharArray[i]==']') {
				indexOfClose=i;
			}
			if(inputCharArray[i]=='[') {
				indexOfOpen=i;
			}
			if(indexOfClose<indexOfOpen) {
				result = "Not Balanced";
				return result;
			}
			
		}

		for (int index = 0; index < inputCharArray.length; index++) {
				if (inputCharArray[index] == '(') {
					countOpenBrack++;
				}
				if (inputCharArray[index] == ')') {
					countCloseBrack++;
				}
				if (inputCharArray[index] == '{') {
					openCurly++;
				}
				if (inputCharArray[index] == '{') {
					closeCurly++;
				}
				if (inputCharArray[index] == '[') {
					openSquare++;
				}
				if (inputCharArray[index] == ']') {
					closeSquare++;
				}
		
		}
		
		if(countOpenBrack==countCloseBrack && openCurly==closeCurly && openSquare==closeSquare) {
			result="Balanced";
			
		}
		
		
		
		
		return result;
	}
	
	
	
}

//String result = "Not Balanced";
//
//char[] inputCharArray = input.toCharArray();
//
//for (int index1 = 0; index1 < inputCharArray.length; index1++) {
//	if(inputCharArray.length%2!=0)
//		break;
//	for (int index2 = 0; index2 < inputCharArray.length; index2++) {
//		if (inputCharArray[index1] == '(' && inputCharArray[index2] == ')') {
//			result = "Balanced";
//		}
//		else if (inputCharArray[index1] == '[' && inputCharArray[index2] == ']') {
//			result = "Balanced";
//		} 
//		else if (inputCharArray[index1] == '{' && inputCharArray[index2] == '}') {
//			result = "Balanced";
//		}
//	}
//}
//return result;
//
//}