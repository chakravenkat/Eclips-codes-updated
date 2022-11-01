package org.scan;

import java.util.Scanner;

public class Ticket {
	
	public static void main(String[] args) {
		
		System.out.println("Southern Railway");
		
		
		Scanner ref = new Scanner(System.in);
		System.out.println();
		
		System.out.println("Enter Your User Id:");
		String name=ref.next();
		
		System.out.println("password:" );
		int a=ref.nextInt();
		System.out.println("From:");
		String frm=ref.next();
		System.out.println("To:");
		String to=ref.next();
		
		System.out.println("Traveling Date:");
		String mnth=ref.next();
		System.out.println("passengers:");
		int psngr=ref.nextInt();
		
		System.out.println("Adults:");
		long ad=ref.nextLong();
		System.out.println("Your Ticket is conformed");
		System.out.println("");
		System.out.println(     "    PNR Enquiry     ");
		
		
		System.out.println("Enter Your PNR Num:");
		int pnr=ref.nextInt();
		
	}
	
	

}
