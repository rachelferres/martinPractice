/**
 * 
 */
package practiceMore;

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
		int [] result = muliplesFive(100);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(i);
		}
		//System.out.println(middleThree("HeeYESlle"));
		
	}
	
	public static boolean stringE (String str) {
		boolean result = false;
		int eCount=0;
		for (int index = 0; index < str.length(); index++) {
			if(str.charAt(index)=='e') {
				eCount++;
			}
		}
		if(eCount>=1 &&eCount<=3) {
			result = true;
		}

		return result;
	}
	public static String middleThree(String str) {
		String result ="";
		for (int index = str.length()/2-1; index < str.length()/2+2; index++) {
			result += str.charAt(index);
			
		}
		
		//str = str.substring(str.length()/2-1, str.length()/2+2);
		return result;
	}
	
	public static int[] muliplesFive(int num) {
		int[] nums = new int [20];
		int count=0;
		for (int index = 0; index < num; index++) {
			if(index%5==0) {
				nums[count]=index;
				count++;
		}
		
			
		}
		return nums;
	

}
}