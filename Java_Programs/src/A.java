
public class A {
	public static void main(String[] args) {

		int i;

		for (i = 3; i>= 1; i--) {
			for (int j = 3; j >= i; j--) {

				System.out.print(j);
			}
			System.out.println();
		}
	}
}
