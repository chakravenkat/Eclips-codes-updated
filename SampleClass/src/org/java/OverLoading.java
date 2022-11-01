package org.java;

public class OverLoading {
	private void pushpa() {
		System.out.println("Pushpa partone");
		System.out.println("");
	}

	private void pushpa(int a, int b) {
		System.out.println("Relesing from jan   : " + a);
		System.out.println("reservation from jan  :" + b);
		System.out.println("");
	}

	private void pushpa(double d, float f) {
		System.out.println("Budjet  :" + d + "crs");
		System.out.println("Running Duration   :" + f + "min");
		System.out.println("");

	}

	public static void main(String[] args) {
		OverLoading ref = new OverLoading();
		ref.pushpa();
		ref.pushpa(12, 10);
		ref.pushpa(1200.58, 00245);

	}
}