package programs.com;

public class SecondLargest {

	public static int secondLargest(int[] array) {

		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int number : array) {

			if (number > firstLargest) {

				secondLargest = firstLargest;
				firstLargest = number;
			}

			else if (number > secondLargest && number != firstLargest) {

				secondLargest = number;

			}

		}
		return secondLargest;
	}

	public static void main(String[] args) {

		int[] array = { 12, 34, 56, 21, 10, 46 };

		int secondLargestNumber = secondLargest(array);

		System.out.println("The Second Largest Number is " + secondLargestNumber);
	}

}
