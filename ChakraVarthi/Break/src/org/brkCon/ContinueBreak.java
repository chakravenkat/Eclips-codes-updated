package org.brkCon;

public class ContinueBreak {
	public static void main(String[] args) {
		System.out.println("Enter And Break");
		System.out.println("");
		for (int d = 1; d < 50; d++) {
			if (d >2 && d < 48)
				System.out.println(" " + d);
			d++;
			continue;
		}

	}
}
