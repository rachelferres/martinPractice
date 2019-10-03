/**
 * 
 */
package practiceMore;

/**
 * @author fer19171898
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result= numberOfBracePairs("{[}()]");
		System.out.println(result);
	  
	}
	
	public static int countMultiples(int num) {
		int countMultiples=0;
	    for(int index = 0; index < 10; index++){
	      if(index%3 == 0 || index%5==0){
	        countMultiples+=index;
	      }
	    }
	    System.out.println(countMultiples);
	    
	    return countMultiples;
	}
	
	public static Integer numberOfBracePairs( String braces ) {
	    //if the string length is odd it should return -1 immediately
	    //variables to count the individual brackets in the array and a final variable to return the result
	    //variable to hold the total number of each type of bracket
	    char[] bracesCharArray = braces.toCharArray();
	    int result=0;
	    
	    int countOpenParen=0;
	    int countClosedParen=0;
	    int countOpenCurly=0;
	    int countClosedCurly=0;
	    int countOpenSquare=0;
	    int countClosedSquare=0;
	    
	    int totalParen=0;
	    int totalCurly=0;
	    int totalSquare=0;
	    int totalPairsOfBrackets=0;
	    if(bracesCharArray.length%2!=0){
	      result = -1;
	      return result;
	    }
	    //for loop to interate over the array and count each type
	    
	    for(int index = 0; index < bracesCharArray.length; index++){
	      if(bracesCharArray[index] == '(' ){
	        countOpenParen++;
	      }
	      if(bracesCharArray[index] == ')' ){
	        countClosedParen++;
	      }
	      if(bracesCharArray[index] == '{' ){
	        countOpenCurly++;
	      }
	      if(bracesCharArray[index] == '}' ){
	        countClosedCurly++;
	      }
	      if(bracesCharArray[index] == '[' ){
	        countOpenSquare++;
	      }
	      if(bracesCharArray[index] == ']' ){
	        countClosedSquare++;
	      }
	    }
	    // needs to check for matching brackets, so open must equal closed. If it does then must return the total number of brackets altogther
	    
	    if(countOpenParen==countClosedParen && countOpenCurly==countClosedCurly && countOpenSquare==countClosedSquare){
	      totalPairsOfBrackets= countOpenParen + countOpenCurly + countOpenSquare; //only needs to count opens/or closed to get total pairs
	      result = totalPairsOfBrackets;
	    }else{
	      result = -1;
	    }
	    
	    return result;
	  }

}
