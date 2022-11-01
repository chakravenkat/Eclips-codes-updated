package org.MoviesDa;

public class Books extends TamilMovies {
	
	private void ceat () {
		System.out.println("A1 to A8");
		
	}
	
	private void status() {
		
		System.out.println("Conformed"); 
		
	}
	public static void main(String[] args) {
		Books a =new Books();
		a.state();
		a.location();
		a.Theatre();
		a.name();
		a.ceat();
		a.status();
	}
	

}
