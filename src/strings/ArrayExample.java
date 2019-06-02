package strings;

public class ArrayExample {
	public static void main(String[] args) {

		int a[] = new int[5];
		a[0] = 10;
		a[2] = 22;
		a[3] = 33;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				System.out.println(i);
			} else {
				System.out.println(a[i]);
			}
		}
	}

}
