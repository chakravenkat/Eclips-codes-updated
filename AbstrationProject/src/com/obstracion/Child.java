package com.obstracion;

public  class Child extends Parent {

	public void Id(int n) {
		System.out.println("Enter your Id:" + n);

	}

	@Override
	public void facebook(String c) {
		System.out.println(c);
	}

	public void password(String s, int j) {
System.out.println("enter password:"+j);
	}

	public static void main(String[] args) {
		Child ref = new Child();
		ref.pubg("Player Unknowns Battele Ground");
		ref.update(11);
		ref.Id(542354);
		ref.password("Enter Password",123568);
		ref.facebook("Facebook Id :" + " welcome@1235");
		
	}

}
