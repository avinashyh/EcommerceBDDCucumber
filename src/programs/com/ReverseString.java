package programs.com;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Atharva Avinash";

		String rev = " ";

		int length = name.length();

		for (int i = length - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);
		}

		System.out.println("Reversed name is = " + rev);
	}

}
