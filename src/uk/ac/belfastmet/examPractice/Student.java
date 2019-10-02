/**
 * 
 */
package uk.ac.belfastmet.examPractice;

/**
 * @author fer19171898
 *
 */
public class Student {
	private int age;
	private String name;
	
	public static int numberOfStudents;
	
	/**
	 * default constructor
	 */
	public Student() {
		
	}
	
	
	/**
	 * @param age
	 * @param name
	 */
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
		numberOfStudents++;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return number of students
	 */
	public static int getNumberOfStudents() {
		return numberOfStudents;
	}

}
