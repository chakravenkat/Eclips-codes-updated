package org.irctc;

public class Train implements PNR_Status, Railway {

	public void UserName(String a) {
		System.out.println("Name : "  + a);
	}

	@Override
	public void password(int i) {
		System.out.println("Enter Your Password: " + i);

	}

	@Override
	public void enq(int l) {
		System.out.println("Enquiry Num : " + l);

	}

	@Override
	public void avail(int a) {
		System.out.println("Available Tickets : " + a);

	}

	public static void main(String[] args) {
		Train ref = new Train();
		ref.UserName("Dhoni");
		ref.password(99665);
		ref.avail(12);
		ref.enq(1093);
	}
}
