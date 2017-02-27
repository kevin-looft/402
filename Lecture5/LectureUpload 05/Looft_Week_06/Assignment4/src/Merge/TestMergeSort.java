package homework4.merge;

/*
 * This is an example of a successful run:
 * 
	Displaying students array before sorting...
	Students [firstName=Joe, lastName=Jones, studentId=1001]
	Students [firstName=Adam, lastName=Ant, studentId=950]
	Students [firstName=Bill, lastName=Barnes, studentId=735]
	Students [firstName=Mark, lastName=Roth, studentId=1102]
	Students [firstName=Jerome, lastName=Howard, studentId=1050]
	Being sorting...
	End sorting...
	Displaying students array after sorting...
	Students [firstName=Adam, lastName=Ant, studentId=950]
	Students [firstName=Bill, lastName=Barnes, studentId=735]
	Students [firstName=Mark, lastName=Roth, studentId=1102]
	Students [firstName=Jerome, lastName=Howard, studentId=1050]
	Students [firstName=Joe, lastName=Jones, studentId=1001]
 *	
 */

public class TestMergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student[] students = initializeStudentsArray();
		
		System.out.println("Displaying students array before sorting...");
		display(students);
		
		System.out.println("Being sorting...");
		/*
		 * The Student array will be sorted by studentId
		 * which is declared as a String
		 */
		Merge.sort(students); // TODO: Fix the Student class to eliminate this error
		System.out.println("End sorting...");
		
		System.out.println("Displaying students array after sorting...");
		display(students);
	}

	private static Student[] initializeStudentsArray() {
		Student stu1 = new Student("555", "Smith", "Kevin");
		Student stu2 = new Student("333", "Jordan", "Bob");
		Student stu3 = new Student("444", "Jones", "Mark");
		Student stu4 = new Student("111", "Roth", "Eric");
		Student stu5 = new Student("222", "Howard", "Brian");
		Student[] students = {stu1, stu2, stu3, stu4, stu5};
		return students;
	}

	private static void display(Student[] students) {
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

}
