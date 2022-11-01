package com.sample;

import java.util.Scanner;

public class BusTicket {
	public static void main(String[] args) {
		System.out.println("WELCOME TO KPN TRAVELS");
		
		Scanner sc =new Scanner(System.in);
		String from = sc.nextLine();
		System.out.println("From :"+from);
		String to = sc.nextLine();
		System.out.println("To :"+to);
		
		int date = sc.nextInt();
      
	
		System.out.println("Date Of Journey :"+date);
		int month = sc.nextInt();
		System.out.println("Month :"+month);
		
	}

}
