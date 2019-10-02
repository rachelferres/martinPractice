/**
 * 
 */
package uk.ac.belfastmet.examPractice;

/**
 * @author fer19171898
 *
 */
public class StringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringExample stringExample = new StringExample();
		System.out.println(stringExample.hiStart("hi rachel"));
	}
	
	/**...
	 *Put in your javadoc B****! Was totally Rachael js.
	 *I concur, Chris :)
	 */
	
	
	 
	  public boolean hiStart(String str) {
	 
		boolean hiStart = false;
		
		if(str.startsWith("hi")) {
			hiStart = true;
		}
		
		return hiStart;
	}
	public String charRemoved(String str, int index) {
		String firstString =str.substring(0, index);
		
		String secondString = str.substring(index+1, str.length());
		
		String charRemoved = firstString+secondString;
		
		return charRemoved;
	}
	
	public boolean sleepIn(boolean weekDay, boolean vacation) {
		boolean sleepIn = true;
		if(weekDay && !vacation) {
			sleepIn =false;
		}
		
		return sleepIn;
		
		
	}
	public void firstCharacter() {
		String name = "Rachel";
		boolean startWith = name.endsWith("ehl");
		
		
		
		if(startWith) {
			System.out.println("it starts with the character rac");
		}else {
			System.out.println("doesnt start with rac");
		}
	}
	
	public void containsString() {
		String name = "Rachel";
		int index = name.indexOf("ch");
		
		System.out.println(index);
	}
	
	public void splitString() {
		String sentence = "My name is Rachel Ferres";
		sentence=sentence.toUpperCase();
		String [] strings = sentence.split(" ");
		
		System.out.println(strings.length);
		for (String string : strings) {
			System.out.println(string);
			
		}
		
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i].toLowerCase());
			
		}
		 
	}
}
