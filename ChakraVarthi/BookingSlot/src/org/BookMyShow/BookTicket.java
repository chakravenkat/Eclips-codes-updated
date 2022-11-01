package org.BookMyShow;

public class BookTicket extends TamilMovies {

	private void film() {
		System.out.println("Vikram");
	}

	private void select() {
		System.out.println("Seats Selected");

	}

	public static void main(String[] args) {
		
        BookTicket tm = new BookTicket();
		tm.select();
		tm.film();
		tm.location();
		tm.cinemas();
	    tm.state();
	}

}
