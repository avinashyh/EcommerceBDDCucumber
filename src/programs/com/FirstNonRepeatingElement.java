package programs.com;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElement {

	/*
	 * This line defines a public static method named firstNonRepeatingElement that
	 * takes an integer array (array) as input and returns an integer.
	 */
	public static int firstNonRepeatingElement(int[] array) {

		/*
		 * This line creates a HashMap named countMap, where keys are integers
		 * representing array elements and values are integers representing their
		 * counts.
		 */
		Map<Integer, Integer> countMap = new HashMap<>();

		for (int number : array) {

			/*
			 * This line updates the count of the current element num in the countMap. If
			 * the element is not present in the map, it initializes its count to 1;
			 * otherwise, it increments the existing count by 1
			 */
			countMap.put(number, countMap.getOrDefault(number, 0) + 1);
		}

		for (int number : array) {

			/*
			 * This line checks if the count of the current element num is equal to 1,
			 * indicating it's a non-repeating element
			 */
			if (countMap.get(number) == 1) {

//This line returns the first non-repeating element found in the array.
				return number;

			}
		}
//This line returns -1 if no non-repeating element is found in the array.
		return -1;
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int result = firstNonRepeatingElement(array);

		System.out.println("First non-repeating element: " + result);
	}

}