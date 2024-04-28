package programs.com;

import java.util.HashMap;
import java.util.Map;

public class CountTheOccureneceOfNonRepeatingElemnt {

	public static int counttheOccurenceofNonRepeatingElement(int[] array, int target) {

		Map<Integer, Integer> countMap = new HashMap<>();

		for (int number : array) {
			countMap.put(number, countMap.getOrDefault(number, 0) + 1);
		}

		return countMap.getOrDefault(target, 0);
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 9, 8, 7, 5, 4, 2 };

		int target = 8;
 
		int result = counttheOccurenceofNonRepeatingElement(array, target);
		System.out.println("TheOccureneceOfNonRepeatingElemnt  8 is " + result);
	}

}
