package homework4.selection;

import java.util.Date;

/*
 * This is an example of a successful run:
 * 
 	Displaying checks array before sorting...
	Check [checkNumber=1001, payTo=Joe Jones, date=Mon Feb 06 15:36:40 CST 2017]
	Check [checkNumber=950, payTo=Adam Ant, date=Mon Feb 06 15:36:40 CST 2017]
	Check [checkNumber=735, payTo=Bill Barnes, date=Mon Feb 06 15:36:40 CST 2017]
	Check [checkNumber=1102, payTo=Mark Roth, date=Mon Feb 06 15:36:40 CST 2017]
	Check [checkNumber=1050, payTo=Jerome Howard, date=Mon Feb 06 15:36:40 CST 2017]
	Being sorting...
	End sorting...
	Displaying checks array after sorting...
	Check [checkNumber=735, payTo=Bill Barnes, date=Mon Feb 06 15:36:40 CST 2017]
	Check [checkNumber=950, payTo=Adam Ant, date=Mon Feb 06 15:36:40 CST 2017]
	Check [checkNumber=1001, payTo=Joe Jones, date=Mon Feb 06 15:36:40 CST 2017]
	Check [checkNumber=1050, payTo=Jerome Howard, date=Mon Feb 06 15:36:40 CST 2017]
	Check [checkNumber=1102, payTo=Mark Roth, date=Mon Feb 06 15:36:40 CST 2017]
 *	
 */

public class TestSelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Check[] checks = initializeChecksArray();
		
		System.out.println("Displaying checks array before sorting...");
		display(checks);
		
		System.out.println("Being sorting...");
		/*
		 * The Checks array will be sorted by checkNumber
		 * which is declared as a Integer
		 */
		Selection.sort(checks); // TODO: Fix the Check class to eliminate this error
		System.out.println("End sorting...");
		
		System.out.println("Displaying checks array after sorting...");
		display(checks);
	}

	private static Check[] initializeChecksArray() {
		Check check1 = new Check(555, "Kevin", new Date());
		Check check2 = new Check(444, "Mark", new Date());
		Check check3 = new Check(222, "Eric", new Date());
		Check check4 = new Check(111, "Bob", new Date());
		Check check5 = new Check(333, "Brian", new Date());
		Check[] checkArray = {check1, check2, check3, check4, check5};
		return checkArray;
	}

	private static void display(Check[] checks) {
		for (Check check : checks) {
			System.out.println(check.toString());
		}
	}

}
