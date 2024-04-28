package programs.com;

public class SecondSmallest {

	public static int secondSmallest(int[] array) {

		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int number : array) {

			if (number < firstSmallest) {

				secondSmallest = firstSmallest;

				firstSmallest = number;
			}

			else if (number < secondSmallest && number != firstSmallest) {

				secondSmallest = number;
			}
			
		}

			return secondSmallest;
		
	}

	public static void main(String[] args) {

		int[] array = { 19, 26, 78, 43, 13, 17, 90 };

		int secondSmallestNumber = secondSmallest(array);

		System.out.println("Second Smallest Number is " + secondSmallestNumber);

	}

}
