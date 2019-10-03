/**
 * 
 */
package uk.ac.belfastmet.examPractice;



/**
 * @author fer19171898
 *
 */
public class Revision {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Revision revision = new Revision();
		System.out.println(revision.isPalindrome("raaecar"));
	}
	/**
	 * 
	 * @param color
	 * @return
	 */
	public String seeColor(String color) {
		
		if(color.startsWith("red")) {
			color="red";
		}else if(color.startsWith("blue")) {
			color="blue";
		}else {
			color = "";
		}
		
		return color;
	}
	/**
	 * 
	 * @param str
	 * @return
	 */
	public boolean isPalindrome(String str) {
		System.out.println(str.length()/2);
		boolean isPalindrome=true;
		for (int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				isPalindrome=false;
				break;
			}
		}
		
		return isPalindrome;
	}
	/**
	 * 
	 * @param str
	 * @return
	 */
	public boolean doubleX(String str) {
		boolean isDoubleX=false;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='x'&& str.charAt(i+1)=='x') {
				isDoubleX=true;
				break;
			}else if (str.charAt(i)=='x'&& str.charAt(i+1)!='x') {
				
			}
		}
		
		return isDoubleX;
	}
}
