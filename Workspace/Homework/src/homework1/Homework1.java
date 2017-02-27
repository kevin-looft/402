package homework1;

/**
 * This is a skeleton file for your homework. Edit the sections marked TODO. You
 * may also edit the function "main" to test your code.
 *
 * You must not change the declaration of any method. This will be true of every
 * skeleton file I give you.
 *
 * For example, you will get zero points if you change the line
 * <pre>
 *     public static double minValue (double[] list) {
 * </pre>
 * to something like
 * <pre>
 *     public static void minValue (double[] list) {
 * </pre>
 * or
 * <pre>
 *     public static double minValue (double[] list, int i) {
 * </pre>
 * 
 * Each of the functions below (minValue, minPosition, distanceBetweenMinAndMax) 
 * is meant to be SELF CONTAINED. This means that you should use no other functions
 * or classes. You should not use any HashSets or ArrayLists, 
 * or anything else! In addition, each of your functions should go
 * through the argument array at most once. The only exception to this
 * removeDuplicates, which is allowed to call numUnique and then go through the
 * array once after that.
 */

public class Homework1 {

	/**
	 * minValue returns the minimum value in an array of doubles. You can assume
	 * the array is nonempty and has no duplicates. Your solution must go
	 * through the array exactly once. Your solution must not call any other
	 * functions. Here are some examples (using "==" informally):
	 *
	 * <pre>
	 *   -7  == minValue (new double[] { 1, -4, -7, 7, 8, 11 })
	 * </pre>
	 */
	public static double minValue (double[] list) {
		//Since array is nonempty, we can start with the first entry.
		double min = list[0];
		//Can start the comparison at i=1, no need to compare the first entry to itself. 
		for (int i = 1; i < list.length; i++) {
			if (list[i] < min) {
				min = list[i];
			}
		}
		return min; //TODO: fix this with your code
	}

	/**
	 * minPosition returns the position of the minimum value in an array of
	 * doubles. The first position in an array is 0 and the last is the
	 * array.length-1.
	 *
	 * You can assume the array is nonempty and has no duplicates. Your solution
	 * must go through the array exactly once. Your solution must not call any
	 * other functions. Here are some examples (using "==" informally):
	 *
	 * <pre>
	 *   0 == minPosition(new double[] { -13, -4, -7, 7, 8, 11 })
	 * </pre>
	 */
	public static int minPosition (double[] list) {
		//Since array is nonempty, we can start with the first entry.
		double min = list[0];
		int minPosition = 0;
		//Can start the comparison at i=1, no need to compare the first entry to itself.
		for (int i = 1; i < list.length; i++) {
			if (list[i] < min) {
				min = list[i];
				minPosition = i;
			}
		}
		return minPosition; //TODO: fix this with your code
	}

	/**
	 * distanceBetweenMinAndMax returns difference between the minPosition and
	 * the maxPosition in an array of doubles.
	 *
	 * You can assume the array is nonempty and has no duplicates. Your solution
	 * must go through the array exactly once. Your solution must not call any
	 * other functions. Here are some examples (using "==" informally):
	 *
	 * <pre>
	 *   1 == distanceBetweenMinAndMax(new double[] { 1, -4, -7, 7, 8, 11, -9 }) // -9,11
	 * </pre>
	 */
	public static int distanceBetweenMinAndMax (double[] list) {
		//Since arrays are nonempty, we can start with the first entry.
		double max = list[0];
		double min = list[0];
		int maxPosition = 0;
		int minPosition = 0;
		//Can start the comparison at i=1, no need to compare the first entry to itself.
		for (int i = 1; i < list.length; i++) {
			if (list[i] > max) {
				max = list[i];
				maxPosition = i;
			}
			if (list[i] < min) {
				min = list[i];
				minPosition = i;
			}
		}
		int distanceBetweenMinAndMax = minPosition - maxPosition;
		if (distanceBetweenMinAndMax < 0) {
			//Return the distance as a positive number. 
			distanceBetweenMinAndMax = 0 - distanceBetweenMinAndMax;
		}
		return distanceBetweenMinAndMax; //TODO: fix this with your code
	}

	/**
	 * The following tests below should pass if your methods above are correct.
	 * It is required for you to write 5 more tests for each method to ensure your 
	 * methods above are written correctly.
	 */
	public static void main(String[] args) {
		System.out.println("Running minValue tests...");
		// minValue Test sample
		double minValue = minValue (new double[] { 1, -4, -7, 7, 8, 11 });
		if (minValue == -7) {
			System.out.println("The minValue test was successful.");
		} else {
			System.out.println("The minValue test was not successful.");
		}

		// minValue Test 2
		minValue = minValue (new double[] { -100, -45, -17, 7, 80, 116 });
		if (minValue == -100) {
			System.out.println("The minValue test 2 was successful.");
		} else {
			System.out.println("The minValue test 2 was not successful.");
		}

		// minValue Test 3
		minValue = minValue (new double[] { -131, -405, -17, 17, 80, 116 });
		if (minValue == -405) {
			System.out.println("The minValue test 3 was successful.");
		} else {
			System.out.println("The minValue test 3 was not successful.");
		}

		// minValue Test 4
		minValue = minValue (new double[] { 1, 2, 4, 0, 80, 10 });
		if (minValue == 0) {
			System.out.println("The minValue test 4 was successful.");
		} else {
			System.out.println("The minValue test 4 was not successful.");
		}

		// minValue Test 5
		minValue = minValue (new double[] { 1, 2, 4, 7, -80, 0 });
		if (minValue == -80) {
			System.out.println("The minValue test 5 was successful.");
		} else {
			System.out.println("The minValue test 5 was not successful.");
		}

		// minValue Test 6
		minValue = minValue (new double[] { 1, 2, 4, 7, 80, 0 });
		if (minValue == 0) {
			System.out.println("The minValue test 6 was successful.");
		} else {
			System.out.println("The minValue test 6 was not successful.");
		}

		
		System.out.println("\nRunning minPosition tests...");
		// minPosition Test sample
		double minPosition = minPosition(new double[] { -13, -4, -7, 7, 8, 11 });
		if (minPosition == 0) {
			System.out.println("The minPosition test was successful.");
		} else {
			System.out.println("The minPosition test was not successful.");
		}
		
		// minPosition Test 2
		minPosition = minPosition(new double[] { -3, -14, -7, 7, 8, 11 });
		if (minPosition == 1) {
			System.out.println("The minPosition test 2 was successful.");
		} else {
			System.out.println("The minPosition test was 2 not successful.");
		}
		
		// minPosition Test 3
		minPosition = minPosition(new double[] { -3, -14, -17, 7, 8, 11 });
		if (minPosition == 2) {
			System.out.println("The minPosition test 3 was successful.");
		} else {
			System.out.println("The minPosition test was 3 not successful.");
		}
		
		// minPosition Test 4
		minPosition = minPosition(new double[] { 3, 14, 17, 0, 8, 1 });
		if (minPosition == 3) {
			System.out.println("The minPosition test 4 was successful.");
		} else {
			System.out.println("The minPosition test was 4 not successful.");
		}
		
		// minPosition Test 5
		minPosition = minPosition(new double[] { 3, 14, 17, 0, -1, 1 });
		if (minPosition == 4) {
			System.out.println("The minPosition test 5 was successful.");
		} else {
			System.out.println("The minPosition test was 5 not successful.");
		}
		
		// minPosition Test 6
		minPosition = minPosition(new double[] { 3, 14, 17, 0, 8, -1 });
		if (minPosition == 5) {
			System.out.println("The minPosition test 6 was successful.");
		} else {
			System.out.println("The minPosition test was 6 not successful.");
		}
				
		
		System.out.println("\nRunning distanceBetweenMinAndMax tests...");
		// distanceBetweenMinAndMax Test sample
		double distance = distanceBetweenMinAndMax(new double[] { 1, -4, -17, 7, 8, 11, -9 });
		if (distance == 3) {
			System.out.println("The distanceBetweenMinAndMax test was successful.");
		} else {
			System.out.println("The distanceBetweenMinAndMax test was not successful.");
		}
		
		// distanceBetweenMinAndMax Test 2
		distance = distanceBetweenMinAndMax(new double[] { -100, 14, -17, 7, 8, 11, -9 });
		if (distance == 1) {
			System.out.println("The distanceBetweenMinAndMax test 2 was successful.");
		} else {
			System.out.println("The distanceBetweenMinAndMax test 2 was not successful.");
		}
		
		// distanceBetweenMinAndMax Test 3
		distance = distanceBetweenMinAndMax(new double[] { 100, -40, -17, 7, 8, 11, -1 });
		if (distance == 1) {
			System.out.println("The distanceBetweenMinAndMax test 3 was successful.");
		} else {
			System.out.println("The distanceBetweenMinAndMax test 3 was not successful.");
		}
		
		// distanceBetweenMinAndMax Test 4
		distance = distanceBetweenMinAndMax(new double[] { 100, -4, -17, 7, 8, 11, -100 });
		if (distance == 6) {
			System.out.println("The distanceBetweenMinAndMax test 4 was successful.");
		} else {
			System.out.println("The distanceBetweenMinAndMax test was 4 not successful.");
		}
		
		// distanceBetweenMinAndMax Test 5
		distance = distanceBetweenMinAndMax(new double[] { 100, -4, -17, 7, 8, 11, -100 });
		if (distance == 6) {
			System.out.println("The distanceBetweenMinAndMax test 5 was successful.");
		} else {
			System.out.println("The distanceBetweenMinAndMax test 5 was not successful.");
		}
		
		// distanceBetweenMinAndMax Test 6
		//Edge case, min and max at the same position.
		distance = distanceBetweenMinAndMax(new double[] { 1 });
		if (distance == 0) {
			System.out.println("The distanceBetweenMinAndMax test 6 "
					+ "was successful.");
		} else {
			System.out.println("The distanceBetweenMinAndMax test 6 was not successful.");
		}

	}

}
