package SampleTestCase;

import org.testng.annotations.Test;

public class Beast {
	 
	
	@Test(priority= -2)
	public void  shootStarts() {
System.out.println("Shooting strats from april");
	}
	@Test(priority= -3)
	public void preProduction() {
		System.out.println("preproduction works done");
	}
	@Test(priority= 5)
	public void greens() {
		System.out.println("Corona batch pass");
		
	}
	@Test(priority= 3)
	public void release() {
		System.out.println("movie Released");
		
	}
	
	@Test(priority= -1)
	public void shootOver() {
		System.out.println("Last Day of The Shot");
	}
	@Test(priority= 1)
	
	public void releaseDate() {
		System.out.println("April 13 World wide Release");
	}
	@Test(priority= 4)
	public void clash() {
		System.out.println("Beast Vs KGF 2");
	}
	@Test(priority= 2)
	public void Reservation() {
		System.out.println("Reservatkion Starts From Apr 09");
	}
	@Test
	public void postProduction() {
		System.out.println("PostProduction Work Going On");
	}
	
	
}
