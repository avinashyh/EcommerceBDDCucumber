package programs.com;

public class Interview {

	static int a;

	public static void main(String[] args) {

		Interview obj1 = new Interview();
		obj1.a = 4;

		Interview obj2 = new Interview();
		obj2.a = 9;

		Interview obj3 = new Interview();
		obj3.a = 1;

		System.out.println(obj1.a + obj2.a + obj3.a);

	}

}
