package uk.ac.belfastmet.examPractice;

import java.util.ArrayList;

public class Animals {
	public static void main(String[] args) {
        Animals animals = new Animals();
        ArrayList<String> one = new ArrayList<String>();
        //one= animals.theAnimals();
        one =animals.removeAnimals();
        //animals.removeAllAnimals();
        
        for(int index = 0; index < one.size(); index++) { 
            System.out.println(one.get(index));
        }

   }
	/**
	 * 
	 * @return
	 */
   public ArrayList<String> theAnimals() {

        ArrayList<String> one = new ArrayList<String>();
        one.add("Elephant");
        one.add("Rhino");
        one.add("Lion");
        one.add("Dog");
        one.add("Cat");

       
        return one;
        
   }
   /**
    * 
    * @return
    */
   public ArrayList<String> removeAnimals () {

        ArrayList<String> one = theAnimals();
        one.remove("Elephant");
        System.out.println("This word has been removed:" + " " + one );
        
        
        return one;
   }
   /**
    * 
    * @return
    */
   public boolean removeAllAnimals() {

        ArrayList<String> one = theAnimals();
        boolean removeAll = one.removeAll(one);
        
        System.out.println(removeAll + " " + "This array is empty");
        
        return removeAll;
   
   }

}
