package com.sample;

public class TrainTicket {
	public void Train1() {

		System.out.println("Guruvayur Sf Express");
	}

	public void trainNo() {
		System.out.println("254842");
	}

	public void From() {
		System.out.println("Chennai(MAS)");
	}

	public void To() {
		System.out.println("Tirunelveli(TVL)");
	}

	public void Ticket() {
		System.out.println("Your Ticket is Conformed");
	}

	public void SeatNo() {
		System.out.println("45,46");
	}

	public void Adult() {
		System.out.println("Adults : 2");
	}

	public void Departure() {
		System.out.println("Monday 09.00AM");

	}


	public static void main(String[] args) {
		TrainTicket T=new TrainTicket();
		T.Train1();
		T.trainNo();
		T.From();
		T.To();
		T.Ticket();
		T.Adult();
		T.SeatNo();
        T.Departure();
        
	
		
	}
}



