package com.overRiding;

public class OvrRide extends OverRiding {

	@Override
	public void name(String a) {


	}

	@Override
	public void mobile(String b, int c) {

	}

	@Override
	public void networktype(int e) {

	}

	private void amazon(String m) {
		System.out.println(m);

	}

	public static void main(String[] args) {
		OvrRide ref = new OvrRide();
		ref.name("Samsung");
		ref.mobile("Airtel", 638126907);
		ref.networktype(4);
		ref.amazon("Thank You For Choosing Amazon");
	}
}
