package programs.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueElementsFromTheArray {

	public static void main(String[] args) {

		String[] array = { "AVINASH", "GEETA", "ATHARVA", "Avinash", "Geeta", "ATHARVA" };

		Set<String> uniqueElements = new HashSet<>(Arrays.asList(array));

		for (String uniqueElement : uniqueElements) {

			System.out.println(uniqueElement);
		}

	}

}
