/**
 * 
 */
package uk.ac.belfastmet.examPractice;

/**
 * @author fer19171898
 *
 */
public class Temperatures {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperatures temperatures = new Temperatures();
		
		System.out.println(temperatures.fizzString("hihihihihihihihihihi"));
		
	}
	/**
	 * Put a description in this top part of the java doc
	 * 
	 * @param start 
	 * @param end
	 * @return result
	 */
	public String[] fizzBuzz(int start, int end) {
		String[] result = new String [end-start];
		int currentNumber= start;
		
		// Don't use 'i' as your variable in a for loop. 
		// Use something more meaningful like index or count
		for (int i = 0; i < result.length; i++) {
			if(start%15==0) {
				result[i]="FizzBuzz";
			}else if(start%5==0) {
				result[i]="Buzz";
			}else if(start%3==0) {
				result[i]="Fizz";
			}else {
				result[i]=String.valueOf(currentNumber);
			}
			
			currentNumber++;
		}
		
		return result;
		  
	}
 
	/**
	 * 
	 * @param str
	 * @return
	 */
	public String fizzString(String str) {
		String fizzOrBuzz="";
		if(str.startsWith("f") && str.endsWith("b")) {
			fizzOrBuzz="FizzBuzz";
		}
		else if(str.startsWith("f")) {
			fizzOrBuzz="Fizz";
		}else if(str.endsWith("b")) {
			fizzOrBuzz="buzz";
		}else {
			return str;
		}
		
		
		return fizzOrBuzz;  
	}
	
	
//	Return the number of times that the string "hi" appears anywhere in the given string.
//
//	countHi("abc hi ho") → 1
//	countHi("ABChi hi") → 2
//	countHi("hihi") → 2
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public int countHi(String str) {
		int count =0;
		
		for (int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i)=='h'&& str.charAt(i+1)=='i') {
				count++;
			}
		}
		
		
		return count;
	}
	
	
//	Given a string, return a string where for every char in the original, there are two chars.
//
//			doubleChar("The") → "TThhee"
//			doubleChar("AAbb") → "AAAAbbbb"
//			doubleChar("Hi-There") → "HHii--TThheerree"
	/**
	 * 
	 * @param str
	 * @return
	 */
	public String doubleChar(String str) {
		String temp = "";
		
		for (int i = 0; i < str.length(); i++) {
			char tempChar = str.charAt(i);
			temp= temp+ Character.toString(tempChar)+ Character.toString(tempChar);
		}
		
		return temp;
		  
	}

	
	
	/**
	 * 
	 * @param string str
	 * @param int n
	 * @return method to return a string containing every nth character of an original string
	 */
	public String everyNth(String str, int n) {
		String temp = null;
		String str2="";
		for (int i = 0; i < str.length(); i++) {
			if(i==0||i%n==0) {
				temp=String.valueOf(str.charAt(i));
				str2=str2+temp;
			}
			
		}
		
		
		return str2;
		
		
	}
	/**
	 * 
	 * @param str
	 * @return
	 */
	public int countXX(String str) {
		int count = 0;
		if(str.contains("x")) {
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)=='x') {
					count++;
				}
			}
		}
		return count;
		
	}
	/**
	 *  
	 * @param temp1
	 * @param temp2
	 * @return
	 */
	public boolean icyHot(int temp1, int temp2) {
		boolean tempsOutOfRange = false;
		
		if(temp1<0 && temp2>100 || temp2<0 && temp1>100) {
			tempsOutOfRange = true;
		}
		
		return tempsOutOfRange;
		
	}

}
