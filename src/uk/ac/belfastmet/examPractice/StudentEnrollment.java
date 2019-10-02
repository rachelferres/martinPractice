/**
 * 
 */
package uk.ac.belfastmet.examPractice;

/**
 * @author fer19171898
 *
 */
public class StudentEnrollment {
	
	public static void main(String[] args) {
		Student student1 = new Student(33, "Rachel");
		Student student2 = new Student(29, "Rachael");
		Student student3 = new Student(26, "Dearbhail");

		System.out.println(Student.numberOfStudents);
		
		
		System.out.println(Student.getNumberOfStudents());
	}

}
