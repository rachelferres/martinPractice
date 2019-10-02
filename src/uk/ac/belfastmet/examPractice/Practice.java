/**
 * 
 */
package uk.ac.belfastmet.examPractice;

import java.util.ArrayList;

/**
 * @author fer19171898
 *
 */
public class Practice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice practice = new Practice();
		ArrayList<String> stringArrayList = new ArrayList(practice.returnArrayList());
		for (String string : stringArrayList) {
			System.out.print(string);
			
			
		}
		System.out.println();
		//for (int i = 0; i < stringArrayList.size(); i++) {
			stringArrayList.clear();
	//	}
	//	
		
		System.out.println(stringArrayList);
	}
	/**
	 * @param string1, string2
	 * @return
	 */
	public ArrayList<String> returnArrayList(){
		
		String string1 = "hello";
		String string2 = "world";
		
		ArrayList<String> stringArrayList = new ArrayList();
		stringArrayList.add(string1);
		stringArrayList.add(string2);
	
		
		return stringArrayList;
		
	}

}
