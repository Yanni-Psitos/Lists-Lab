package ListLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Driver {
	
	private static String[] firstNames = {"Josh", "John", "Jason", "Dave", "Mike", "Dan", "Gary", "Frank", "Joe",
			"Eric", "Bob", "Kyle", "Bill", "Shane", "Andrew", "Jim", "Doug", "Chris", "Katie", 
			"Kayla", "Sarah", "Elizabeth", "Stef", "Mary", "Jane", "Kelly", "Jessica", "Beth",
			"Carla", "Becky", "Linda", "Ruth", "Sandra", "Amy", "Claire", "Donna"};
	
	private static String[] lastNames = {"Smith", "Davis", "Jones", "Taylor", "Manning", "Jennings", "Williams",
			"Parker", "Elliot", "Patrick", "Johnson", "Davidson", "O'Connor", "Fritz", "Green",
			"Gold", "Foley", "Freeman", "Willis", "Grant"};

	public static void main(String[] args) {
		List<ListLab.Student> studentArrayList = new ArrayList<>();
		MyLinkedList<ListLab.Student> studentLinkedList = new ListLab.MyLinkedList<>();
		
		generateStudents(20, studentArrayList);
		generateStudents(20, studentLinkedList);
		
		//Determine which data structure is fastest for each
		//operation. Complete the action
		
		//Delete the first, if any, Student with the last name of "Smith"
		for(int i = 0; i<studentLinkedList.getSize(); i++){
			if(studentLinkedList.get(i) == "Smith"){
				studentLinkedList.remove(i);
			}
		}

		//Change the name of the 3rd entry to "Joe Montana"
		studentArrayList.set(2,"Joe Montana");
		//Remove the 10th element
		studentLinkedList.remove(9);

	}
	
	//To generate the ArrayList
	private static void generateStudents(int numberOfStudents, List<ListLab.Student> outList) {
		Random random = new Random();
		
		for(int i = 0; i < numberOfStudents; i++) {
			int firstNameIndex = random.nextInt(firstNames.length -1);
			int lastNameIndex = random.nextInt(lastNames.length -1);
			double gpa = 3.5 * random.nextDouble() + 0.5;
			outList.add(new ListLab.Student(firstNames[firstNameIndex], lastNames[lastNameIndex], gpa));
		}
	}

	//To fill the custom LinkedList
	private static void generateStudents(int numberOfStudents, MyLinkedList<ListLab.Student> outList) {
		Random random = new Random();
		
		for(int i = 0; i < numberOfStudents; i++) {
			int firstNameIndex = random.nextInt(firstNames.length -1);
			int lastNameIndex = random.nextInt(lastNames.length -1);
			double gpa = 3.5 * random.nextDouble() + 0.5;
			outList.add(new ListLab.Student(firstNames[firstNameIndex], lastNames[lastNameIndex], gpa));
		}
	}
}
