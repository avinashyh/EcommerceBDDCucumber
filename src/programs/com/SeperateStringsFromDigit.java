package programs.com;

public class SeperateStringsFromDigit {

	public static void main(String[] args) {

		String input = "Avi123Attu4567AA89Z";

		String[] parts = input.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

		for (String part : parts) {

			System.out.println(part);
		}
	}

}
