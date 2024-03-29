package homework5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestSortOptions {

	public static void main(String[] args) {
		ArrayList<Contact> contacts = initializeContactsArray();
        promptForOption(contacts);
	}

    /*
     * Data Initialization
     */
    
    private static ArrayList<Contact> initializeContactsArray() {
    	Contact contact1 = new Contact("Kevin", "Smith", "IL", 25);
    	Contact contact2 = new Contact("Bob", "Jordan", "TX", 55);
    	Contact contact3 = new Contact("Mark", "Jones", "NY", 30);
    	Contact contact4 = new Contact("Eric", "Roth", "WY", 45);
    	Contact contact5 = new Contact("Brian", "Howard", "MI", 24);
    	ArrayList<Contact> contacts = new ArrayList<Contact>();
    	contacts.add(contact1);
    	contacts.add(contact2);
    	contacts.add(contact3);
    	contacts.add(contact4);
    	contacts.add(contact5);
        return contacts;
    }
    
    /*
     * Prompt for the user to enter their option from the keyboard
     *
     * 1 = Sort by last name
     * 2 = Sort by Home State
     * 3 = Sort by Age
     * 0 = End input and exit/terminate the application
     *
     */
    
    private static void promptForOption(ArrayList<Contact> contacts) {
        System.out.println("Sort by last name  :[1]");
        System.out.println("Sort by home state :[2]");
        System.out.println("Sort by age        :[3]");
        System.out.print("Enter sort option or 0 to end input:");
        Scanner reader = new Scanner(System.in);
        try {
        	int num = reader.nextInt();
            switch (num) {
            case 0: {
            	System.out.println("Terminating...");
            	return;
            }
            case 1: {
            	Collections.sort(contacts, new LastNameComparator());
            	break;
            }
            case 2: {
            	Collections.sort(contacts, new HomeStateComparator());
            	break;
            }
            case 3: {
            	Collections.sort(contacts, new AgeComparator());
            	break;
            }
            default:
            	System.out.println("Invalid entry. Terminating...");
            	return;
            }
        }
        catch (Exception e) {
        	System.out.println("Not a valid number. Terminating...");
        	return;
        }
        displayContacts(contacts);
    }

    /*
     * Display the Contact information sorted by using the selected option from 
     * the above "promptForOption" method result
     */
    
    private static void displayContacts(ArrayList<Contact> contacts) {
        for (Contact contact : contacts) {
        	System.out.println(contact);
		}
    }

}





