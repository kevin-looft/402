package homework4.merge;

/*
 * The Student class will have 3 String type properties:
 * 		firstName
 * 		lastName
 * 		studentId
 */

public class Student implements Comparable<Student> {
	private String studentId;
	private String lastName;
	private String firstName;
	
	public Student(String studentId, String lastName, String firstName) {
		this.studentId = studentId;
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", lastName=" + lastName + ", firstName=" + firstName + "]";
	}

	@Override
	public int compareTo(Student student) {
		return this.studentId.compareTo(student.studentId);
	}
}
