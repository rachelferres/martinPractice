/**
 * 
 */
package uk.ac.belfastmet.examPractice;

/**
 * @author fer19171898
 *
 */
public class IfConditions {

	/**
	 * @param args
	 */
	private int a = 5;
	private int b = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	 IfConditions ifConditions = new IfConditions();
	// ifConditions.printConditions();
	 ifConditions.forConditions();
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 */
	public void printConditions() {
		
	}
	
	public void forConditions() {
		for (int i = 1; i < 10; i+=2) {
	
			System.out.println("index "+i+" = "+i);
		}
	
	}
}
