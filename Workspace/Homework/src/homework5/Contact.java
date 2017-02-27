package homework5;

import java.util.Comparator;

/*
 * The Contact class will have 3 properties:
 * 		firstname   - String
 * 		lastname    - String
 * 		homestate   - String
 * 		age         - Integer
 */

public class Contact {
	private String firstName;
	private String lastName;
	private String homeState;
	private Integer age;

	public Contact(String firstName, String lastName, String homeState, Integer age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.homeState = homeState;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getHomeState() {
		return homeState;
	}

	public Integer getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", homeState=" + homeState + ", age="
				+ age + "]";
	}
	
}

class LastNameComparator implements Comparator<Contact> {
	@Override
	public int compare(Contact c1, Contact c2) {
		return c1.getLastName().compareTo(c2.getLastName());
	}
}

class HomeStateComparator implements Comparator<Contact> {
	@Override
	public int compare(Contact c1, Contact c2) {
		return c1.getHomeState().compareTo(c2.getHomeState());
	}
}

class AgeComparator implements Comparator<Contact> {
	@Override
	public int compare(Contact c1, Contact c2) {
		return c1.getAge().compareTo(c2.getAge());
	}
}


